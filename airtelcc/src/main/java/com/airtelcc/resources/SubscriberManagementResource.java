package com.airtelcc.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/subscriber")
public class SubscriberManagementResource {
	@GET
	@Produces("text/plain")
	public String getSubscriberStatus(@QueryParam("subscriberNo") String subscriberNo) {
		return "pending";
	}
}
