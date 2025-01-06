package com.oyo.api.invoker;

import java.util.Date;

import com.oyo.api.dto.BookingDetails;
import com.oyo.api.dto.ReservationInfo;

public class OyoRoomsTest {
	public static void main(String[] args) {
		ReservationInfo reservationInfo = null;
		BookingDetails bookingDetails = null;
		OyoRoomServiceInvoker oyoRoomServiceInvoker = null;

		reservationInfo = new ReservationInfo();
		reservationInfo.setPersonName("James");
		reservationInfo.setRoomType("Single");
		reservationInfo.setMobileNo("93939379282");
		reservationInfo.setIdType("PANCARD");
		reservationInfo.setIdProof("03903R52GE");
		reservationInfo.setGender("Male");
		reservationInfo.setEmailAddress("james@gmail.com");
		reservationInfo.setCheckoutDate(new Date());
		reservationInfo.setCheckinDate(new Date());
		reservationInfo.setAge(23);
		reservationInfo.setAdvanceAmount(2000);

		oyoRoomServiceInvoker = new OyoRoomServiceInvoker();
		bookingDetails = oyoRoomServiceInvoker.bookRoom(reservationInfo);
		System.out.println(bookingDetails);
	}
}
