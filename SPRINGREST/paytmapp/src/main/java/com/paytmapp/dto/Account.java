package com.paytmapp.dto;

public class Account {
	private String accountHolderName;
	private String mobileNo;
	private String emailAddress;
	private String identityType;
	private String identityValue;

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getIdentityType() {
		return identityType;
	}

	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getIdentityValue() {
		return identityValue;
	}

	public void setIdentityValue(String identityValue) {
		this.identityValue = identityValue;
	}

	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", mobileNo=" + mobileNo + ", emailAddress="
				+ emailAddress + ", identityType=" + identityType + ", identityValue=" + identityValue + "]";
	}

}
