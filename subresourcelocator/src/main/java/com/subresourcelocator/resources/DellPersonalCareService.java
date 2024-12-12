package com.subresourcelocator.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

public class DellPersonalCareService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/product/{modelNo}")
	public String getProduct(@PathParam("modelNo") String modelNo) {
		return "{'Model No': '" + modelNo + "','productName':'Dell Latitude 110','price':9292}";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/warranty/{tagNo}")
	public String checkWarranty(@PathParam("tagNo") String tagNo) {
		return "{'tagNo':'" + tagNo + "', 'warrantyRemaining': 8}";
	}
}
