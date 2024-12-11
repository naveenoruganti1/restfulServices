package com.subresourcemethod.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/bluedartparcel")
public class BluedartParcelService {
	@GET
	@Path("/status")
	public String parcelStatus(@QueryParam("awbNo") String awbNo) {
		return "awbNo : " + awbNo + "out for delivery";
	}

	@GET
	@Path("/charges")
	public String domesticFrieghtCharges(@QueryParam("fromCity") String fromCity, @QueryParam("toCity") String toCity,
			@QueryParam("weight") double parcelWeight) {
		System.out.println("fromCity :" + fromCity + " toCity : " + toCity + " weight : " + parcelWeight);
		return "{amount: 283.3}";
	}

}
