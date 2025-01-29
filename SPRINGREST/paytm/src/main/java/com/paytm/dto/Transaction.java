package com.paytm.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Transaction {
	private String merchantNo;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date transactionDate;
	private double amount;

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
