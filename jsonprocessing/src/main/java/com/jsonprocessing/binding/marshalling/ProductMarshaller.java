package com.jsonprocessing.binding.marshalling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.json.bind.JsonbException;

public class ProductMarshaller {
	public Product marshalProduct(String inFile) throws JsonbException, FileNotFoundException {
		Product product = null;

		Jsonb jsonb = JsonbBuilder.create();
		product = jsonb.fromJson(new FileInputStream(new File(inFile)), Product.class);

		return product;
	}
}
