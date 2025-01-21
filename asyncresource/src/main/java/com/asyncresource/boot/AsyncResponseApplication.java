package com.asyncresource.boot;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import com.asyncresource.resource.PaytmMerchantResource;

public class AsyncResponseApplication extends ResourceConfig {
	public AsyncResponseApplication() {
		System.out.println("application");
		super.register(JacksonFeature.class);
		super.register(PaytmMerchantResource.class);
	}
}
