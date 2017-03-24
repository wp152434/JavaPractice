/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ CarTest2
 * 
 * 1.  개요 :
 * 2. 작성일 : 2017. 3. 24.
 * </pre>
 *
 * @author 			: choichanhwan
 * @version 		: 1.0
 *
 */
public class CarTest2 {
	public static void printAll(Car2 car){
		System.out.println(car.getCompany());
		System.out.println(car.getModel());
		System.out.println(car.getColor());
		System.out.println(car.getMaxSpeed());
		System.out.println(String.format("%,d", car.getPrice()));
	}
	public static void main(String args[]){
		Car2 car1 = new Car2();
		printAll(car1);
		Car2 car2 = new Car2("기아자동차", "K7" ,"흰색",246,40000000);
		printAll(car2);
		Car2 car3 = new Car2("삼성자동차", "SM7" ,"회색",200,38000000);
		printAll(car3);
	}
}
