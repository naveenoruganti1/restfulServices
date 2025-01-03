package com.serverresponse.boot;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import com.serverresponse.resources.PolicyService;

import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("/api")
public class ServerResponseApplication extends ResourceConfig {

	public ServerResponseApplication() {
		register(JacksonFeature.class);
		register(PolicyService.class);
	}

}
