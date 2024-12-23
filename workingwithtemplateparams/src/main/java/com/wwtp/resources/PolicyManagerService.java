package com.wwtp.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/policymanager/{policyNo}")
public class PolicyManagerService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/policy")
	public String getPolicy(@PathParam("policyNo") String policyNo) {
		return "policy no : " + policyNo;
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/benefits/{policyNo}")
	public String getBenefits(@PathParam("policyNo") String policyNo) {
		return "policy benefits for policNo : " + policyNo;
	}

}
