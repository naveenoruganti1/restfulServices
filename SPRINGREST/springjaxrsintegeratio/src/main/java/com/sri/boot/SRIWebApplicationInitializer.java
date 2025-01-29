package com.sri.boot;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.sri.config.ResourceConfig;

public class SRIWebApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext rootApplicationContext = null;
		ContextLoaderListener contextLoaderListener = null;

		rootApplicationContext = new AnnotationConfigWebApplicationContext();
		rootApplicationContext.register(ResourceConfig.class);

		contextLoaderListener = new ContextLoaderListener(rootApplicationContext);
		servletContext.addListener(contextLoaderListener);
	}

}
