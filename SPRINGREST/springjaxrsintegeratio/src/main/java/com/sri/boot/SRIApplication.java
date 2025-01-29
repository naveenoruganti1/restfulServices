package com.sri.boot;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.sri.resource.TrainEnquiryResource;

@ApplicationPath("/api")
public class SRIApplication extends Application {
	private Set<Object> singletons;

	public SRIApplication(@Context ServletContext servletContext) {
		ApplicationContext applicationContext = null;
		TrainEnquiryResource trainEnquiryResource = null;

		singletons = new HashSet<>();
		applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		trainEnquiryResource = applicationContext.getBean(TrainEnquiryResource.class);

		singletons.add(trainEnquiryResource);
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
