package com.cpc.provider;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import com.cpc.converter.ConsumerNoParamConverter;
import com.cpc.dto.ConsumerNo;

import jakarta.ws.rs.ext.ParamConverter;
import jakarta.ws.rs.ext.ParamConverterProvider;
import jakarta.ws.rs.ext.Provider;

@Provider
public class CPCAppParamConverterProvider implements ParamConverterProvider {
	@Override
	public ParamConverter getConverter(Class rawType, Type genericType, Annotation[] annotations) {
		System.out.println("getConverter(" + rawType.getName() + ")");
		if (rawType.isAssignableFrom(ConsumerNo.class)) {
			return new ConsumerNoParamConverter();
		}
		return null;
	}

}
