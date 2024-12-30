package com.jsonprocessing.streaming.generator;

import java.io.FileNotFoundException;

public class GeneratorTest {
	public static void main(String[] args) throws FileNotFoundException {
		ShippingAddress shippingAddress = null;
		ShippingAddressGenerator addressGenerator = null;

		shippingAddress = new ShippingAddress();
		shippingAddress.setAddressLine1("23/9/21, Ram Mandir Road");
		shippingAddress.setAddressLine2("Kings Plaza");
		shippingAddress.setCity("Hyderabad");
		shippingAddress.setState("Telangana");
		shippingAddress.setZip(534208);
		shippingAddress.setCountry("India");

		addressGenerator = new ShippingAddressGenerator();
		addressGenerator.generateJSon(shippingAddress,
				"D:\\work\\master\\webservices\\20201117\\RESTFUL\\jsonprocessing\\src\\main\\resources\\address.json");
		System.out.println("generated..");
	}
}
