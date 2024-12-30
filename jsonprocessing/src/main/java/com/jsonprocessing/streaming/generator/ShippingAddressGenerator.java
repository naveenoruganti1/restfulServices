package com.jsonprocessing.streaming.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import jakarta.json.Json;
import jakarta.json.stream.JsonGenerator;

public class ShippingAddressGenerator {
	public void generateJSon(ShippingAddress shippingAddress, String outFile) throws FileNotFoundException {
		JsonGenerator jsonGenerator = Json.createGenerator(new FileOutputStream(new File(outFile)));
		jsonGenerator.writeStartObject(); // {
		jsonGenerator.write("addressLine1", shippingAddress.getAddressLine1());
		jsonGenerator.write("addressLine2", shippingAddress.getAddressLine2());
		jsonGenerator.write("city", shippingAddress.getCity());
		jsonGenerator.write("state", shippingAddress.getState());
		jsonGenerator.write("zip", shippingAddress.getZip());
		jsonGenerator.write("country", shippingAddress.getCountry());
		jsonGenerator.writeEnd(); // }
		jsonGenerator.close();
	}
}
