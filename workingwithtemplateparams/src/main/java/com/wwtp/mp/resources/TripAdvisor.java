package com.wwtp.mp.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path("/tripadvisor")
public class TripAdvisor {
	@GET
	@Path("/{source}/{destination}/{days}")
	@Produces(MediaType.TEXT_PLAIN)
	public StreamingOutput tourPackages(@PathParam("source") String source,
			@PathParam("destination") String destination, @PathParam("days") int days,
			@QueryParam("places") List<String> places) {
		return (os) -> {
			String tourPackages = "source : " + source + " destination : " + destination + " days : " + days
					+ " places :";
			for (String place : places) {
				tourPackages += place + " , ";
			}
			os.write(tourPackages.getBytes());
			os.close();
		};
	}
}
