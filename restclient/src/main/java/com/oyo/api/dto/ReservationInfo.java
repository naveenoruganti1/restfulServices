package com.oyo.api.dto;

import java.util.Date;

import jakarta.json.bind.annotation.JsonbDateFormat;

public class ReservationInfo {
	protected String personName;
	protected int age;
	protected String gender;
	protected String mobileNo;
	protected String emailAddress;
	protected String idType;
	protected String idProof;
	@JsonbDateFormat(value = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
	protected Date checkinDate;
	@JsonbDateFormat(value = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
	protected Date checkoutDate;
	protected String roomType;
	protected float advanceAmount;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public float getAdvanceAmount() {
		return advanceAmount;
	}

	public void setAdvanceAmount(float advanceAmount) {
		this.advanceAmount = advanceAmount;
	}

}
