
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
public class CarTest {
	public static void printAll(Car car){
		System.out.println(car.getCompany());
		System.out.println(car.getModel());
		System.out.println(car.getColor());
		System.out.println(car.getMaxSpeed());
		System.out.println(String.format("%,d", car.getPrice()));
	}
	
	public static void main(String args[]){
		Car car = new Car();
		
		printAll(car);
		car.setCompany("기아자동차");
		car.setModel("k7");
		car.setColor("흰");
		car.setMaxSpeed(246);
		car.setPrice(40000000);
		printAll(car);
		car.setCompany("삼성자동차");
		car.setModel("SM7");
		car.setColor("회색");
		car.setMaxSpeed(200);
		car.setPrice(38000000);
		printAll(car);
	}
}

