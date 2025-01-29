package com.paytm.message.converters;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import com.paytm.dto.TransactionHistory;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;

public class HttpJsonMessageConverter implements HttpMessageConverter<Object> {

	@Override
	public boolean canRead(Class<?> clazz, MediaType mediaType) {
		if (mediaType.equals(MediaType.APPLICATION_JSON)) {
			if (clazz == TransactionHistory.class) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean canWrite(Class<?> clazz, MediaType mediaType) {
		if (mediaType.equals(MediaType.APPLICATION_JSON)) {
			if (clazz == TransactionHistory.class) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<MediaType> getSupportedMediaTypes() {
		return Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON });
	}

	@Override
	public Object read(Class<? extends Object> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		JsonbBuilder jsonbBuilder = null;
		Jsonb jsonb = null;

		System.out.println("Class<? extends Object> clazz, HttpInputMessage inputMessage");
		jsonbBuilder = JsonbBuilder.newBuilder();
		jsonb = jsonbBuilder.build();
		Object obj = jsonb.fromJson(inputMessage.getBody(), clazz);

		return obj;
	}

	@Override
	public void write(Object t, MediaType contentType, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		JsonbBuilder jsonbBuilder = null;
		Jsonb jsonb = null;

		System.out.println("write(Object t, MediaType contentType, HttpOutputMessage outputMessage)");
		jsonbBuilder = JsonbBuilder.newBuilder();
		jsonb = jsonbBuilder.build();

		jsonb.toJson(t, outputMessage.getBody());
	}

}
