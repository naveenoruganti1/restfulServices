package com.tp.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/restaurant")
public class RestaurantResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	/**
	 * define template parameters reserving the locations where we want to receive
	 * the data as part of URI
	 * 
	 * @param location
	 * @param foodType
	 * @return
	 */
	@Path("/{loc}/{type}") // unless we reserve location in uri we cannot receive them
	public String findRestaurants(@PathParam("type") String foodType, @PathParam("loc") String location) {
		return "['paradise', 'continental','little idly','" + location + "','" + foodType + "']";
	}
}
