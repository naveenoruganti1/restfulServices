package com.oyo.rooms.resource;

import java.util.UUID;

import com.oyo.rooms.service.BookingDetails;
import com.oyo.rooms.service.ReservationInfo;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/oyorooms")
public class OyoRoomService {

	@POST
	@Path("/book")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public BookingDetails bookRoom(ReservationInfo reservationInfo) {
		BookingDetails bookingDetails = null;

		bookingDetails = new BookingDetails();
		bookingDetails.setBookingNo(UUID.randomUUID().toString());
		bookingDetails.setPersonName(reservationInfo.getPersonName());
		bookingDetails.setMobileNo(reservationInfo.getMobileNo());
		bookingDetails.setEmailAddress(reservationInfo.getEmailAddress());
		bookingDetails.setIdProof(reservationInfo.getIdProof());
		bookingDetails.setIdType(reservationInfo.getIdType());
		bookingDetails.setRoomType(reservationInfo.getRoomType());
		bookingDetails.setCheckinDate(reservationInfo.getCheckinDate());
		bookingDetails.setCheckoutDate(reservationInfo.getCheckoutDate());
		bookingDetails.setAmountPaid(reservationInfo.getAdvanceAmount());
		bookingDetails.setBalanceAmount(1000);
		return bookingDetails;
	}

}
