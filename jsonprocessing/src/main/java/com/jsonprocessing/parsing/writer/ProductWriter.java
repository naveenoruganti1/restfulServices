package com.jsonprocessing.parsing.writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.UUID;

import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.JsonWriter;

public class ProductWriter {
	public static void main(String[] args) throws FileNotFoundException {
		JsonWriter jsonWriter = Json.createWriter(new FileOutputStream(new File(
				"D:\\work\\master\\webservices\\20201117\\RESTFUL\\jsonprocessing\\src\\main\\resources\\product.json")));
		JsonObjectBuilder productObjectBuilder = Json.createObjectBuilder();
		productObjectBuilder.add("productNo", UUID.randomUUID().toString());
		productObjectBuilder.add("productName", "Hp Laptop");
		productObjectBuilder.add("price", 93839.50);

		JsonArrayBuilder featuresArrayBuilder = Json.createArrayBuilder();
		featuresArrayBuilder.add("Touch screen");
		featuresArrayBuilder.add("hd camera");
		featuresArrayBuilder.add("Full Hd display");
		featuresArrayBuilder.add("AMD Graphics 60MB");
		productObjectBuilder.add("features", featuresArrayBuilder);

		JsonObject productJSonObject = productObjectBuilder.build();
		jsonWriter.writeObject(productJSonObject);
		jsonWriter.close();
	}
}
