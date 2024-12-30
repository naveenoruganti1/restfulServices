package com.jsonprocessing.binding.marshalling;

import java.io.FileNotFoundException;

import jakarta.json.bind.JsonbException;

public class ProductTest {
	public static void main(String[] args) throws JsonbException, FileNotFoundException {
		ProductMarshaller pm = new ProductMarshaller();
		Product product = pm.marshalProduct(
				"D:\\work\\master\\webservices\\20201117\\RESTFUL\\jsonprocessing\\src\\main\\resources\\product.json");
		System.out.println(product);
	}
}
