package com.exceptionhandling.mapper;

import com.exceptionhandling.dto.Error;
import com.exceptionhandling.exception.AccountNotFoundException;

import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class AccountNotFoundExceptionMapper implements ExceptionMapper<AccountNotFoundException> {
	@Override
	public Response toResponse(AccountNotFoundException exception) {
		Error error = new Error();
		error.setErrorCode("001");
		error.setErrorMessage("account not found");
		return Response.status(Status.NOT_FOUND).entity(error).build();
	}

}
