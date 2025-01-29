package com.ba.boot;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import com.ba.resource.ICCMatchResource;

@ApplicationPath("/api")
public class BasicAuthenticationApplication extends ResourceConfig {

	public BasicAuthenticationApplication() {
		register(ICCMatchResource.class);
		register(RolesAllowedDynamicFeature.class);
	}

}
