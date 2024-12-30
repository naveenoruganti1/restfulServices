package com.jsonprocessing.binding.unmarshalling;

import java.io.FileNotFoundException;
import java.util.Date;

import jakarta.json.bind.JsonbException;

public class MarshallerTest {
	public static void main(String[] args) throws JsonbException, FileNotFoundException {
		Address sourceAddress = new Address("23-8, Maszid road", "near police station", "vijayawada", "Andhrapradesh",
				34573, "India");
		Address destinationAddress = new Address("73/2/13, Taj Tristart", "3rd Floor", "Hyderabad", "Telangana", 34532,
				"India");
		Parcel parcel = new Parcel();
		parcel.setParcelNo(2939);
		parcel.setShippedDate(new Date());
		parcel.setSourceAddress(sourceAddress);
		parcel.setDestinationAddress(destinationAddress);
		parcel.setDeliveryCharges(2342);
		parcel.setContents(new String[] { "mobile", "docking station" });

		ParcelMarshaller parcelMarshaller = new ParcelMarshaller();
		parcelMarshaller.marshallParcel(parcel,
				"D:\\work\\master\\webservices\\20201117\\RESTFUL\\jsonprocessing\\src\\main\\resources\\parcel.json");
	}
}
