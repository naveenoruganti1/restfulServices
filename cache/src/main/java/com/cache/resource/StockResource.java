package com.cache.resource;

import java.util.Date;

import com.cache.dto.Stock;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.CacheControl;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/stock")
public class StockResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{stockName}/price")
	public Response getStockPrice(@PathParam("stockName") String stockName) {
		double price = 0.0;
		Date expireDate = null;
		Response response = null;

		if (stockName.equals("sbi")) {
			price = 3456;
		} else if (stockName.equals("icici")) {
			price = 1200;
		} else {
			price = 1000;
		}

		System.out.println("received request for stockName: " + stockName);

		expireDate = new Date(2021, 6, 29, 21, 18, 15);
		response = Response.ok(price).expires(expireDate).build();

		return response;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{stockName}/details")
	public Response getStockDetails(@PathParam("stockName") String stockName) {
		Stock stock = null;
		Response response = null;
		CacheControl cacheControl = null;

		System.out.println("received request for stock details : " + stockName);

		Date listedDate = new Date(2016, 06, 23);
		stock = new Stock();
		stock.setStockName(stockName);
		stock.setListedCompanyName("Cipla");
		stock.setListedDate(listedDate);
		stock.setPrice(2000);

		cacheControl = new CacheControl();
		cacheControl.setPrivate(false);
		cacheControl.setMaxAge(60 * 1);

		response = Response.ok(Entity.json(stock)).cacheControl(cacheControl).build();
		return response;
	}
}
