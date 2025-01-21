package com.asyncresource.dto;

public class MerchantAccount {
	private String merchantAccountNo;
	private String registeredName;
	private String registeredMobileNo;
	private String emailAddress;
	private double accountLimit;
	private String status;

	public String getMerchantAccountNo() {
		return merchantAccountNo;
	}

	public void setMerchantAccountNo(String merchantAccountNo) {
		this.merchantAccountNo = merchantAccountNo;
	}

	public String getRegisteredName() {
		return registeredName;
	}

	public void setRegisteredName(String registeredName) {
		this.registeredName = registeredName;
	}

	public String getRegisteredMobileNo() {
		return registeredMobileNo;
	}

	public void setRegisteredMobileNo(String registeredMobileNo) {
		this.registeredMobileNo = registeredMobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public double getAccountLimit() {
		return accountLimit;
	}

	public void setAccountLimit(double accountLimit) {
		this.accountLimit = accountLimit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
