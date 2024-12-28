package com.cpc.boot;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class CPCApplication extends Application {

	public CPCApplication() {
		System.out.println("application..");
	}

	/*
	 * private Set<Object> singletons; private Set<Class<?>> classes;
	 * 
	 * public CPCApplication() { singletons = new HashSet<>(); classes = new
	 * HashSet<>();
	 * 
	 * classes.add(ElectricityBillService.class); //singletons.add(new
	 * ConsumerNoParamConverter()); }
	 * 
	 * @Override public Set<Class<?>> getClasses() { return classes; }
	 * 
	 * @Override public Set<Object> getSingletons() { return singletons; }
	 */
}
