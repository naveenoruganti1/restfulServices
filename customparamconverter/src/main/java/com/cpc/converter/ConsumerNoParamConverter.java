package com.cpc.converter;

import com.cpc.dto.ConsumerNo;

import jakarta.ws.rs.ext.ParamConverter;

public class ConsumerNoParamConverter implements ParamConverter<ConsumerNo> {

	@Override
	public ConsumerNo fromString(String value) {
		ConsumerNo consumerNo = null;

		System.out.println("fromString()");
		consumerNo = new ConsumerNo();
		consumerNo.setStateCode(value.substring(0, 2));
		consumerNo.setDistrictCode(value.substring(2, 4));
		consumerNo.setZone(Integer.parseInt(value.substring(4, 7)));
		consumerNo.setSubstation(Integer.parseInt(value.substring(7, 10)));
		consumerNo.setMeterNo(Integer.parseInt(value.substring(10, 15)));

		return consumerNo;
	}

	@Override
	public String toString(ConsumerNo value) {
		return value.toString();
	}

}
