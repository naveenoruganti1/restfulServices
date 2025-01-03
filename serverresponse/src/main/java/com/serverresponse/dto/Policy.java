package com.serverresponse.dto;

public class Policy {
	private int policyNo;
	private String planName;
	private String policyHolderName;
	private double insurredAmount;

	public int getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public double getInsurredAmount() {
		return insurredAmount;
	}

	public void setInsurredAmount(double insurredAmount) {
		this.insurredAmount = insurredAmount;
	}

}
