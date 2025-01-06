package com.paytm.test;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

public class PayTMWalletTest {
	public static void main(String[] args) {
		ClientBuilder clientBuilder = ClientBuilder.newBuilder();
		clientBuilder.property("connection.timeout", 1800);
		Client client = clientBuilder.build();

		WebTarget webTarget = client.target("http://localhost:8081/paytm/api/paytmwallet");
		webTarget = webTarget.queryParam("mobileNo", "9283938444");

		Invocation.Builder inBuilder = webTarget.request();
		Invocation invocation = inBuilder.buildGet();
		Response response = invocation.invoke();
		if (response.getStatus() == 200) {
			double balance = response.readEntity(Double.class);
			System.out.println("balance : " + balance);
		}
	}
}
