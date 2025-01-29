package com.paytm.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionHistory {
	private List<Transaction> transactions;

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void addTransaction(String merchantNo, Date transactionDate, double amount) {
		Transaction transaction = null;
		if (transactions == null) {
			transactions = new ArrayList<>();
		}
		transaction = new Transaction();
		transaction.setMerchantNo(merchantNo);
		transaction.setTransactionDate(transactionDate);
		transaction.setAmount(amount);
		transactions.add(transaction);
	}
}
