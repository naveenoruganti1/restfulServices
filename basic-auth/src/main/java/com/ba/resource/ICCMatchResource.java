package com.ba.resource;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/iccmatch")
public class ICCMatchResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{uniqueMatchCode}/score")
	@RolesAllowed("premium")
	public long getScore(@PathParam("uniqueMatchCode") String uniqueMatchCode) {
		return 201;
	}
}
