package com.jsonprocessing.binding.unmarshalling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.json.bind.JsonbConfig;
import jakarta.json.bind.JsonbException;

public class ParcelMarshaller {
	public void marshallParcel(Parcel parcel, String outputFile) throws JsonbException, FileNotFoundException {
		JsonbConfig jsonbConfig = new JsonbConfig().withFormatting(true);
		Jsonb jsonb = JsonbBuilder.create(jsonbConfig);
		jsonb.toJson(parcel, new FileOutputStream(new File(outputFile)));
	}
}
