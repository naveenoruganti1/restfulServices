package com.cache.resource;

import java.util.HashMap;
import java.util.Map;

import com.cache.dto.MatchScore;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.CacheControl;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.EntityTag;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Request;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;

@Path("/iccmatch")
public class ICCMatchResource {
	private Map<String, MatchScore> matchScoreMap;

	public ICCMatchResource() {
		MatchScore matchScore = null;

		matchScore = new MatchScore();
		matchScore.setUniqueMatchNo("umn1");
		matchScore.setTournamentName("IPL 2021");
		matchScore.setBattingTeam("India");
		matchScore.setFieldingTeam("Pakistan");
		matchScore.setOvers(23.2f);
		matchScore.setScore(100);
		matchScore.setWickets(3);

		matchScoreMap = new HashMap<>();
		matchScoreMap.put("umn1", matchScore);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{uniqueMatchNo}/score")
	public Response getScore(@PathParam("uniqueMatchNo") String uniqueMatchNo, @Context Request request) {
		MatchScore dbMatchScore = null;
		EntityTag entityTag = null;
		ResponseBuilder builder = null;
		CacheControl cacheControl = null;

		if (matchScoreMap.containsKey(uniqueMatchNo) == false) {
			throw new WebApplicationException(404);
		}
		System.out.println("fetching match score for umno: " + uniqueMatchNo);
		dbMatchScore = matchScoreMap.get(uniqueMatchNo);
		entityTag = new EntityTag(String.valueOf(dbMatchScore.hashCode()));
		cacheControl = new CacheControl();
		cacheControl.setMaxAge(30 * 1);

		builder = request.evaluatePreconditions(entityTag);
		if (builder != null) { // etags are matching, so ask the client to use the data from cache
			builder.cacheControl(cacheControl);
			return builder.build();
		}

		builder = Response.ok(Entity.json(dbMatchScore)).tag(entityTag).cacheControl(cacheControl);
		return builder.build();
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response updateMatchScore(MatchScore matchScore) {
		if (matchScoreMap.containsKey(matchScore.getUniqueMatchNo()) == false) {
			throw new WebApplicationException(404);
		}
		matchScoreMap.put(matchScore.getUniqueMatchNo(), matchScore);
		return Response.accepted(matchScore.getUniqueMatchNo()).build();
	}

}
