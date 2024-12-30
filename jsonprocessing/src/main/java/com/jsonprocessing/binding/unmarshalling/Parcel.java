package com.jsonprocessing.binding.unmarshalling;

import java.util.Date;

import jakarta.json.bind.annotation.JsonbDateFormat;
import jakarta.json.bind.annotation.JsonbNumberFormat;
import jakarta.json.bind.annotation.JsonbProperty;

public class Parcel {
	@JsonbProperty("awbno")
	private int parcelNo;
	@JsonbProperty("source")
	private Address sourceAddress;
	@JsonbProperty("destination")
	private Address destinationAddress;
	@JsonbDateFormat("dd-MM-yyyy")
	private Date shippedDate;
	@JsonbNumberFormat(value = "#0.0")
	private double deliveryCharges;
	private String[] contents;

	public int getParcelNo() {
		return parcelNo;
	}

	public void setParcelNo(int parcelNo) {
		this.parcelNo = parcelNo;
	}

	public Address getSourceAddress() {
		return sourceAddress;
	}

	public void setSourceAddress(Address sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	public Address getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(Address destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public double getDeliveryCharges() {
		return deliveryCharges;
	}

	public void setDeliveryCharges(double deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}

	public String[] getContents() {
		return contents;
	}

	public void setContents(String[] contents) {
		this.contents = contents;
	}

}
