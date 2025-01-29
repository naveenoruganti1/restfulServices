package com.sri.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("/trainenquiry")
public class TrainEnquiryResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{ticketNo}/ticketstatus")
	public String getTicketStatus(@PathParam("ticketNo") String ticketNo) {
		return "WL/10";
	}
}
