package com.bovespa;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Stock {
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public BigDecimal getOpen_price() {
		return open_price;
	}
	public void setOpen_price(BigDecimal open_price) {
		this.open_price = open_price;
	}
	public BigDecimal getClose_price() {
		return close_price;
	}
	public void setClose_price(BigDecimal close_price) {
		this.close_price = close_price;
	}
	public BigDecimal getMax_price() {
		return max_price;
	}
	public void setMax_price(BigDecimal max_price) {
		this.max_price = max_price;
	}
	public BigDecimal getMin_price() {
		return min_price;
	}
	public void setMin_price(BigDecimal min_price) {
		this.min_price = min_price;
	}
	private String code;
	private LocalDate date;
	private BigDecimal open_price, close_price, max_price, min_price;
}
