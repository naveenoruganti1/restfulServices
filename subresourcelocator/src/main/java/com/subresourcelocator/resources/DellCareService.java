package com.subresourcelocator.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/dellcare")
public class DellCareService {
	private DellPersonalCareService dellPersonalCareService;
	private DellEnterpriseCareService dellEnterpriseCareService;

	public DellCareService() {
		dellPersonalCareService = new DellPersonalCareService();
		dellEnterpriseCareService = new DellEnterpriseCareService();
	}

	@GET
	@Path("/care/{city}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getContactCareNumber(@PathParam("city") String city) {
		return "99872729833";
	}

	/*
	 * @Path("/personal") public DellPersonalCareService personalCareService() {
	 * System.out.println("personal care : " + dellPersonalCareService.hashCode());
	 * return dellPersonalCareService; }
	 * 
	 * @Path("/enterprise") public DellEnterpriseCareService enterpriseCareService()
	 * { System.out.println("enterprise care : " +
	 * dellEnterpriseCareService.hashCode()); return dellEnterpriseCareService; }
	 */

	@Path("/{serviceType}")
	public Object dellServices(@PathParam("serviceType") String serviceType) {
		if (serviceType.equals("personal")) {
			return dellPersonalCareService;
		} else if (serviceType.equals("enterprise")) {
			return dellEnterpriseCareService;
		}

		return null;
	}
}
