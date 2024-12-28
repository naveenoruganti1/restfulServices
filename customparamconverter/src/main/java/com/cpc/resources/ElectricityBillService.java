package com.cpc.resources;

import com.cpc.dto.ConsumerNo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/electricity")
public class ElectricityBillService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{consumerNo}/bill")
	public String getBill(@PathParam("consumerNo") ConsumerNo consumerNo) {
		return consumerNo.toString();
	}

}
