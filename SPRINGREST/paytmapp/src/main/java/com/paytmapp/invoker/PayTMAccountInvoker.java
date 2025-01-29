package com.paytmapp.invoker;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.paytmapp.dto.Account;
import com.paytmapp.dto.TransactionHistory;

@Component
public class PayTMAccountInvoker {
	private final String BASE_URI = "http://localhost:8081/paytm/api/paytmaccount";

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * /{accountNo}/balance GET
	 * 
	 * @param accountNo
	 * @return
	 */
	public String getBalance(String accountNo) {
		String balance = null;
		String resourcePath = null;
		Map<String, Object> pathVariablesMap = null;
		UriComponentsBuilder uriComponentsBuilder = null;

		pathVariablesMap = new HashMap<>();
		pathVariablesMap.put("accountNo", accountNo);
		resourcePath = BASE_URI + "/{accountNo}/balance";
		uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(resourcePath);
		uriComponentsBuilder = uriComponentsBuilder.uriVariables(pathVariablesMap);

		ResponseEntity<String> responseEntity = restTemplate.getForEntity(uriComponentsBuilder.toUriString(),
				String.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			balance = responseEntity.getBody();
		}
		return balance;
	}

	/**
	 * /{accountNo}/history
	 * 
	 * @apiNote merchantNo
	 * @param accountNo
	 * @param merchantNo
	 * @return
	 */
	public TransactionHistory getPaymentHistory(String accountNo, String merchantNo) {
		TransactionHistory transactionHistory = null;
		UriComponentsBuilder uriComponentsBuilder = null;
		Map<String, Object> pathVariablesMap = null;
		String resourceURI = null;

		resourceURI = BASE_URI + "/{accountNo}/history";
		pathVariablesMap = new HashMap<String, Object>();
		pathVariablesMap.put("accountNo", accountNo);
		uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(resourceURI);
		uriComponentsBuilder = uriComponentsBuilder.uriVariables(pathVariablesMap);
		uriComponentsBuilder.queryParam("merchantNo", merchantNo);

		ResponseEntity<TransactionHistory> responseEntity = restTemplate
				.getForEntity(uriComponentsBuilder.toUriString(), TransactionHistory.class);

		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			transactionHistory = responseEntity.getBody();
		}

		return transactionHistory;
	}

	/**
	 * /new
	 * 
	 * @param account
	 * @return
	 */
	public String newAccount(Account account) {
		String resourceURI = null;
		String accountNo = null;

		resourceURI = BASE_URI + "/new";
		accountNo = restTemplate.postForObject(resourceURI, account, String.class);

		return accountNo;
	}

}
