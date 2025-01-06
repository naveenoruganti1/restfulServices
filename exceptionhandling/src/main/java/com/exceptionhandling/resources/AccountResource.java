package com.exceptionhandling.resources;

import com.exceptionhandling.dao.AccountDao;
import com.exceptionhandling.dto.Account;
import com.exceptionhandling.dto.Error;
import com.exceptionhandling.exception.AccountNotFoundException;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/account")
public class AccountResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{accountNo}/details")
	public Response getAccount(@PathParam("accountNo") String accountNo) throws AccountNotFoundException {
		AccountDao accountDao = null;
		Account account = null;

		//try {
			accountDao = new AccountDao();
			account = accountDao.getAccount(accountNo);
		/*} catch (AccountNotFoundException e) {
			Error error = new Error();
			error.setErrorCode("001");
			error.setErrorMessage("Account No not found");
			return Response.status(Status.NOT_FOUND).entity(Entity.json(error)).build();
		}*/

		return Response.ok(Entity.json(account)).build();
	}

	@GET
	@Produces({ MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON })
	@Path("/{accountNo}/balance")
	public double getBalance(@PathParam("accountNo") String accountNo) throws AccountNotFoundException {
		Account account = null;
		AccountDao accountDao = null;

		accountDao = new AccountDao();
		//try {
			account = accountDao.getAccount(accountNo);
		/*} catch (AccountNotFoundException e) {
			Error error = new Error();
			error.setErrorCode("001");
			error.setErrorMessage("accountNo not found");
			Response response = Response.status(Status.NOT_FOUND).entity(Entity.json(error)).build();
			throw new WebApplicationException(response);
		}*/
		return account.getBalance();
	}
}
