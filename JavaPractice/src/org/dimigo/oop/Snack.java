package org.dimigo.oop;

public class Snack {
	private String name, company;
	private int price, number;
	
	public Snack() {
		super();
	}
	public Snack(String name, String company, int price, int number) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int calcPrice(){
		return price * number;
	}
	public String toString(){
		return "이름 : "+this.name+"\n제조사 : "+this.company+"\n가격 : "+String.format("%,d",this.price)+"\n개수 : "+this.number+"\n";
	}
	
}
