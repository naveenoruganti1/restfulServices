package com.serverresponse.resources;

import java.util.Date;

import com.serverresponse.dto.MembershipCard;
import com.serverresponse.dto.Nominee;
import com.serverresponse.dto.Policy;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.NewCookie;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;

@Path("/policy")
public class PolicyService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{policyNo}")
	public Response getPolicy(@PathParam("policyNo") int policyNo) {
		Policy policy = null;
		Response response = null;
		ResponseBuilder responseBuilder = null;

		policy = new Policy();
		policy.setPolicyNo(policyNo);
		policy.setPlanName("Suraksha Plan");
		policy.setPolicyHolderName("Martin");
		policy.setInsurredAmount(300000);

		responseBuilder = Response.ok(Entity.json(policy));
		response = responseBuilder.build();
		//
		return response;
	}

	@GET
	@Path("/{policyNo}/nominee")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getNomineeDetails(@PathParam("policyNo") int policyNo) {
		Nominee nominee = null;
		Response response = null;

		nominee = new Nominee();
		nominee.setNomineeName("Julian");
		nominee.setRelationship("Wife");
		response = Response.ok(Entity.json(nominee)).header("timestamp", new Date()).build();
		return response;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{policyNo}/card")
	public Response getMembershipCard(@PathParam("policyNo") int policyNo) {
		MembershipCard membershipCard = null;
		NewCookie newCookie = null;
		Response response = null;

		membershipCard = new MembershipCard();
		membershipCard.setCardNo("939390029383");
		membershipCard.setCardHolderName("Williams");

		newCookie = new NewCookie("cardNo", "939390029383");
		response = Response.accepted(Entity.json(membershipCard)).header("timestamp", new Date()).cookie(newCookie)
				.build();

		return response;
	}
}
