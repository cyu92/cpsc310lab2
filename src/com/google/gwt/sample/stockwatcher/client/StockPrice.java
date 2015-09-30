package com.google.gwt.sample.stockwatcher.client;
// adding a comment to commit
//adding a second comment
//3rd comment
//4th comment
//5th comment
//6th comment
public class StockPrice {
	private String symbol;
	private double price;

	private double changechange;


	public StockPrice() {
	}

	public StockPrice(String symbol, double price, double change) {
		this.symbol = symbol;
		this.price = price;
		this.changechange = change;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public double getPrice() {
		return this.price;
	}

	public double getChange() {
		return this.changechange;
	}

	public double getChangePercent() {
		return 100.0 * this.changechange / this.price;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setChange(double change) {
		this.changechange = change;
	}

}
