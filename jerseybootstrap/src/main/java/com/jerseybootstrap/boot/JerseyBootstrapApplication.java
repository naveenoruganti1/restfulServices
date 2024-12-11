package com.jerseybootstrap.boot;

import java.util.HashSet;
import java.util.Set;

import com.jerseybootstrap.resources.merchant.MerchantPaymentResource;
import com.jerseybootstrap.resources.upi.GooglePayUPIResource;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

//@ApplicationPath("/resources")
public class JerseyBootstrapApplication extends Application {
	private Set<Object> singletons;
	private Set<Class<?>> classes;

	public JerseyBootstrapApplication() {
		System.out.println("JerseyBootstrapApplication()");

		singletons = new HashSet<>();
		classes = new HashSet<>();
		singletons.add(new GooglePayUPIResource());
		classes.add(MerchantPaymentResource.class);
	}

	@Override
	public Set<Class<?>> getClasses() {
		System.out.println("getClasses()");
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		System.out.println("getSingletons()");
		return singletons;
	}

}
