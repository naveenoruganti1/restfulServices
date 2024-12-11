package com.jerseybootstrap.resources.upi;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

@Path("/googlepay")
public class GooglePayUPIResource {
	@GET
	@Produces("text/plain")
	public String getUpiTransactionStatus(@QueryParam("txNo") String transactionNo) {
		return "pending - " + this.hashCode();
	}
}
