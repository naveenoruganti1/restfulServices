package com.asyncresource.resource;

import java.util.UUID;

import com.asyncresource.dto.MerchantAccount;
import com.asyncresource.dto.MerchantEnrollment;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.container.AsyncResponse;
import jakarta.ws.rs.container.Suspended;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/merchant")
public class PaytmMerchantResource {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void enrollMerchant(final MerchantEnrollment merchantEnrollment,
			@Suspended final AsyncResponse asyncResponse) {

		new Thread(() -> {
			try {
				MerchantAccount merchantAccount = null;
				Thread.sleep(1000);

				merchantAccount = new MerchantAccount();
				merchantAccount.setMerchantAccountNo(UUID.randomUUID().toString());
				merchantAccount.setRegisteredName(merchantEnrollment.getBusinessName());
				merchantAccount.setEmailAddress(merchantEnrollment.getEmailAddress());
				merchantAccount.setRegisteredMobileNo(merchantEnrollment.getMobileNo());
				merchantAccount.setAccountLimit(10000);
				merchantAccount.setStatus("Active");
				asyncResponse.resume(Response.ok(Entity.json(merchantAccount)).build());
			} catch (InterruptedException e) {
				e.printStackTrace();
				asyncResponse.resume(e);
			}
		}).start();
	}
}
