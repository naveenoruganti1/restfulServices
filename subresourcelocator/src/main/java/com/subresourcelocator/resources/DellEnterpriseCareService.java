package com.subresourcelocator.resources;

import java.io.InputStream;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.StreamingOutput;

public class DellEnterpriseCareService {
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public StreamingOutput enquire(InputStream in) {
		return (outputstream) -> {
			StringBuilder builder = new StringBuilder();
			builder.append(
					"<enquiryStatus><refNo>93839344</refNo><status>you will hear back from us within 3 working days</status></enquiryStatus>");
			outputstream.write(builder.toString().getBytes());
			outputstream.close();
		};
	}
}
