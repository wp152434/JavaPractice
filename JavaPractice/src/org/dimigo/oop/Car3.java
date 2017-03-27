package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ Car3
 * 
 * 1.  개요 :
 * 2. 작성일 : 2017. 3. 27.
 * </pre>
 *
 * @author 			: choichanhwan
 * @version 		: 1.0
 *
 */
public class Car3 {
	private String company, model, color;
	private int maxSpeed;
	private long price;
	
	public Car3(){
		
	}
	public Car3(String company, String model, String color, int maxSpeed, long Price){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	public Car3(String company, String model, String color, int maxSpeed){
		this(company, model, color, maxSpeed, 0);
	}
	public Car3(String company, String model, String color){
		this(company, model, color, 0);
	}
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public long getPrice() {
		return price;
	}
}
