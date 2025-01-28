package com.cache.boot;

import org.glassfish.jersey.server.ResourceConfig;

import com.cache.resource.ICCMatchResource;
import com.cache.resource.StockResource;

import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("/api")
public class CacheApplication extends ResourceConfig {

	public CacheApplication() {
		register(new ICCMatchResource());
		register(StockResource.class);
	}

}
