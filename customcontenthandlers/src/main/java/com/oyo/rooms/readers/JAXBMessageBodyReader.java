package com.oyo.rooms.readers;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.ext.MessageBodyReader;
import jakarta.ws.rs.ext.Provider;

@Consumes(MediaType.APPLICATION_XML)
@Provider
public class JAXBMessageBodyReader implements MessageBodyReader<Object> {

	@Override
	public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		if (type.isAnnotationPresent(XmlRootElement.class)) {
			return true;
		}
		return false;
	}

	@Override
	public Object readFrom(Class<Object> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {
		Object obj = null;
		JAXBContext jaxbContext = null;
		Unmarshaller unmarshaller = null;

		try {
			jaxbContext = JAXBContext.newInstance(type);
			unmarshaller = jaxbContext.createUnmarshaller();
			obj = unmarshaller.unmarshal(entityStream);
		} catch (JAXBException e) {
			e.printStackTrace();
			throw new WebApplicationException(e);
		} finally {
			entityStream.close();
		}

		return obj;
	}

}
