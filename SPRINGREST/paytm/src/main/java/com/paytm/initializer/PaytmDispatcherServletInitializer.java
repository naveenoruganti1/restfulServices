package com.paytm.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.paytm.config.RestConfig;

public class PaytmDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { RestConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/api/*" };
	}

}
