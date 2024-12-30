package com.jsonprocessing.streaming.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jakarta.json.Json;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;

public class TotalQuantityParser {
	public int getTotalQuantity(String poFileLocation) throws FileNotFoundException {
		String key = null;
		Event event = null;
		int quantity = 0;
		int totalQuantity = 0;
		JsonParser jsonParser = null;

		jsonParser = Json.createParser(new FileInputStream(new File(poFileLocation)));
		while (jsonParser.hasNext()) {
			event = jsonParser.next();
			if (event == Event.KEY_NAME) {
				key = jsonParser.getString();
				if (key.equals("quantity")) {
					jsonParser.next();
					quantity = jsonParser.getInt();
					totalQuantity += quantity;
				} else if (key.equals("shippingAddress")) {
					break;
				}
			}
		}

		return totalQuantity;
	}
}
