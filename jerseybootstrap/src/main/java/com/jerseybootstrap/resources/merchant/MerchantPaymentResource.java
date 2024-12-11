package com.jerseybootstrap.resources.merchant;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

@Path("/merchantpay")
public class MerchantPaymentResource {
	@GET
	@Produces("text/plain")
	public String getMerchantName(@QueryParam("scancode") String scanCode) {
		return "balaji fruits - " + this.hashCode();
	}
}
