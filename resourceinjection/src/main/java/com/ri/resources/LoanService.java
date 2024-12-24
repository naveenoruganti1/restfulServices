package com.ri.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/loan")
public class LoanService {
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/enquire")
	public String loanEnquiry(@QueryParam("applicantName") String applicantName,
			@FormParam("principleAmount") double principleAmount, @FormParam("tenure") int tenure,
			@FormParam("loanType") String loanType, @FormParam("contactNo") String contactNo) {
		StringBuilder builder = new StringBuilder();
		builder.append("applicantName :").append(applicantName).append(" principleAmount :").append(principleAmount)
				.append(" tenure :").append(tenure).append(" loanType :").append(loanType).append(" contactNo :")
				.append(contactNo);
		return builder.toString();
	}
}
