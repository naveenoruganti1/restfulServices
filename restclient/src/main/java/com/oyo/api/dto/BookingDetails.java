package com.oyo.api.dto;

import java.util.Date;

import jakarta.json.bind.annotation.JsonbDateFormat;

public class BookingDetails {
	protected String bookingNo;
	protected String personName;
	protected String mobileNo;
	protected String emailAddress;
	protected String idType;
	protected String idProof;
	@JsonbDateFormat(value = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
	protected Date checkinDate;
	@JsonbDateFormat(value = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
	protected Date checkoutDate;
	protected String roomType;
	protected float amountPaid;
	protected float balanceAmount;

	public String getBookingNo() {
		return bookingNo;
	}

	public void setBookingNo(String bookingNo) {
		this.bookingNo = bookingNo;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public Date getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public float getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(float amountPaid) {
		this.amountPaid = amountPaid;
	}

	public float getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(float balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	@Override
	public String toString() {
		return "BookingDetails [bookingNo=" + bookingNo + ", personName=" + personName + ", mobileNo=" + mobileNo
				+ ", emailAddress=" + emailAddress + ", idType=" + idType + ", idProof=" + idProof + ", checkinDate="
				+ checkinDate + ", checkoutDate=" + checkoutDate + ", roomType=" + roomType + ", amountPaid="
				+ amountPaid + ", balanceAmount=" + balanceAmount + "]";
	}

}
