package com.jerseybootstrap.boot;

import org.glassfish.jersey.server.ResourceConfig;

import com.jerseybootstrap.resources.merchant.MerchantPaymentResource;
import com.jerseybootstrap.resources.upi.GooglePayUPIResource;

import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("/api")
public class JerseyBootstrapResourceConfig extends ResourceConfig {

	public JerseyBootstrapResourceConfig() {
		super.register(new GooglePayUPIResource());
		super.register(MerchantPaymentResource.class);
	}

}
