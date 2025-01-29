package com.paytm.api.controller;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.paytm.dto.Account;
import com.paytm.dto.TransactionHistory;

@RestController
@RequestMapping("/paytmaccount")
public class PayTMAccountApiController {

	@GetMapping(value = "/{accountNo}/balance", produces = { MediaType.TEXT_PLAIN_VALUE })
	public String getBalance(@PathVariable("accountNo") String accountNo) {
		return "3903";
	}

	@GetMapping(value = "/{accountNo}/history", produces = { MediaType.APPLICATION_JSON_VALUE })
	public TransactionHistory getPaymentHistory(@PathVariable("accountNo") String accountNo,
			@RequestParam("merchantNo") Optional<String> merchantNoOptional) {
		TransactionHistory transactionHistory = null;

		transactionHistory = new TransactionHistory();
		if (merchantNoOptional.isPresent()) {
			transactionHistory.addTransaction(merchantNoOptional.get(), new Date(2021, 2, 12), 9838);
		}
		transactionHistory.addTransaction("k39398", new Date(2021, 2, 13), 983);
		transactionHistory.addTransaction("ld093839", new Date(2021, 3, 22), 7232);
		transactionHistory.addTransaction("039k9283", new Date(2021, 4, 21), 27);

		return transactionHistory;
	}

	@PostMapping(value = "/new", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> newAccount(@RequestBody Account account) {
		System.out.println(account);
		String accountNo = UUID.randomUUID().toString();
		return ResponseEntity.status(HttpStatus.CREATED).contentType(MediaType.TEXT_PLAIN).body(accountNo);
	}

}
