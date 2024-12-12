package com.subresourcelocator.boot;

import java.util.HashSet;
import java.util.Set;

import com.subresourcelocator.resources.DellCareService;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class SubResourceLocatorApplication extends Application {
	private Set<Object> singletons;

	public SubResourceLocatorApplication() {
		singletons = new HashSet<>();
		singletons.add(new DellCareService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
