/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ Car2
 * 
 * 1.  개요 :
 * 2. 작성일 : 2017. 3. 24.
 * </pre>
 *
 * @author 			: choichanhwan
 * @version 		: 1.0
 *
 */
public class Car2 {
	private String company = "현대자동차", model = "제네시스", color="검정색";
	private int maxSpeed = 225;
	private long price = 50000000;
	
	public Car2(){
		
	}
	public Car2(String company, String model, String color, int maxSpeed, long Price){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
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
