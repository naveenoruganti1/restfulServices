package com.exceptionhandling.boot;

import java.util.HashSet;
import java.util.Set;

import org.glassfish.jersey.jackson.JacksonFeature;

import com.exceptionhandling.mapper.AccountNotFoundExceptionMapper;
import com.exceptionhandling.resources.AccountResource;

import jakarta.ws.rs.core.Application;

public class ExceptionHandlingApplication extends Application {
	private Set<Class<?>> classes;
	private Set<Object> singletons;

	public ExceptionHandlingApplication() {
		classes = new HashSet<>();
		singletons = new HashSet<>();

		classes.add(AccountResource.class);
		classes.add(JacksonFeature.class);
		classes.add(AccountNotFoundExceptionMapper.class);
	}

	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
