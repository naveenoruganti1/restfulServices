package com.paytm.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

@Path("/paytmwallet")
public class PaytmWalletResource {

	@GET
	@Produces("text/plain")
	public double getWalletBalance(@QueryParam("mobileNo") String mobileNo) {
		// business and persistence logic in fetching the balance of the wallet based on
		// mobileNo and return to the Client Program
		return 3939;
	}
}
