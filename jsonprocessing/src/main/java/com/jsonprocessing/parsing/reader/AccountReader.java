package com.jsonprocessing.parsing.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Set;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

public class AccountReader {
	public static void main(String[] args) throws FileNotFoundException {
		JsonReader jsonReader = Json.createReader(new FileInputStream(new File(
				"D:\\work\\master\\webservices\\20201117\\RESTFUL\\jsonprocessing\\src\\main\\resources\\account.json")));
		JsonObject accountJsonObject = jsonReader.readObject();

		/*
		 * String accountNo = accountJsonObject.getString("accountNo");
		 * System.out.println("accountNo : " + accountNo); String facebookProfile =
		 * accountJsonObject.getString("facebookProfile");
		 * System.out.println("facebook profile : " + facebookProfile); Integer balance
		 * = accountJsonObject.getInt("balance"); System.out.println("balance : " +
		 * balance);
		 */

		Set<String> keys = accountJsonObject.keySet();
		for (String key : keys) {
			System.out.println("key : " + key + "value : " + accountJsonObject.get(key));
		}

	}
}
