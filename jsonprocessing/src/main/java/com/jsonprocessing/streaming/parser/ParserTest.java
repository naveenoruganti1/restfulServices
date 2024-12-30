package com.jsonprocessing.streaming.parser;

import java.io.FileNotFoundException;

public class ParserTest {
	public static void main(String[] args) throws FileNotFoundException {
		TotalQuantityParser totalQuantityParser = new TotalQuantityParser();
		int tquantity = totalQuantityParser.getTotalQuantity(
				"D:\\work\\master\\webservices\\20201117\\RESTFUL\\jsonprocessing\\src\\main\\resources\\po.json");
		System.out.println("total quantity : " + tquantity);
	}
}
