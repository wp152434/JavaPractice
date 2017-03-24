package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ CarTest
 * 
 * 1.  개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author 			: choichanhwan
 * @version 		: 1.0
 *
 */
public class Car {
	private String company = "현대자동차", model = "제네시스", color="검정색";
	private int maxSpeed = 225;
	private long price = 50000000;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getCompany() {
		return company;
	} 
	public String getModel( ){
		return model;
	} 
	public int getMaxSpeed() {
		return maxSpeed;
	} 
	public long getPrice() {
		return price;
	} 
	public void setCompany(String company){
		this.company = company;
	}
	public void setModel(String model){
		this.model = model;
	}
	public void setMaxSpeed(int maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	public void setPrice(long price){
		this.price = price;
	}
}
