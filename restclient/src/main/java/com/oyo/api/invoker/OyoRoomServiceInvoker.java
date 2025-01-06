package com.oyo.api.invoker;

import com.oyo.api.dto.BookingDetails;
import com.oyo.api.dto.ReservationInfo;
import com.oyo.api.readers.JSONBMessageBodyReader;
import com.oyo.api.writers.JSONBMessageBodyWriter;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;

public class OyoRoomServiceInvoker {
	private Client client;
	private String BASE_URI = "http://localhost:8081/customcontenthandlers/api/oyorooms";

	public OyoRoomServiceInvoker() {
		ClientBuilder builder = null;

		builder = ClientBuilder.newBuilder();
		client = builder.build();
		client.register(JSONBMessageBodyReader.class);
		client.register(JSONBMessageBodyWriter.class);
	}

	/**
	 * ./book
	 * 
	 * @param reservationInfo (request body: json)
	 * @return (json)
	 */
	public BookingDetails bookRoom(ReservationInfo reservationInfo) {
		BookingDetails bookingDetails = null;

		bookingDetails = client.target(BASE_URI).path("/book").request().accept(MediaType.APPLICATION_JSON)
				.post(Entity.json(reservationInfo), BookingDetails.class);

		return bookingDetails;
	}

}
