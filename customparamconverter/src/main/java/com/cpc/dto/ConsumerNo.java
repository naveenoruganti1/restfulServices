package com.cpc.dto;

public class ConsumerNo {
	private String stateCode;
	private String districtCode;
	private int zone;
	private int substation;
	private int meterNo;

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	public int getSubstation() {
		return substation;
	}

	public void setSubstation(int substation) {
		this.substation = substation;
	}

	public int getMeterNo() {
		return meterNo;
	}

	public void setMeterNo(int meterNo) {
		this.meterNo = meterNo;
	}

	@Override
	public String toString() {
		return "ConsumerNo [stateCode=" + stateCode + ", districtCode=" + districtCode + ", zone=" + zone
				+ ", substation=" + substation + ", meterNo=" + meterNo + "]";
	}

}
