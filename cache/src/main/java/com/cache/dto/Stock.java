package com.cache.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Stock {
	private String stockName;
	private String listedCompanyName;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date listedDate;
	private double price;

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getListedCompanyName() {
		return listedCompanyName;
	}

	public void setListedCompanyName(String listedCompanyName) {
		this.listedCompanyName = listedCompanyName;
	}

	public Date getListedDate() {
		return listedDate;
	}

	public void setListedDate(Date listedDate) {
		this.listedDate = listedDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
