package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ CarTest3
 * 
 * 1.  개요 :
 * 2. 작성일 : 2017. 3. 27.
 * </pre>
 *
 * @author 			: choichanhwan
 * @version 		: 1.0
 *
 */
public class CarTest3 {
	public static void printAll(Car3 car){
		System.out.println(car.getCompany());
		System.out.println(car.getModel());
		System.out.println(car.getColor());
		System.out.println(car.getMaxSpeed());
		System.out.println(String.format("%,d", car.getPrice()));
	}
	public static void main(String args[]){
		Car3 car1 = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		printAll(car1);
		Car3 car2 = new Car3("기아자동차", "K7" ,"흰색",246);
		printAll(car2);
		Car3 car3 = new Car3("삼성자동차", "SM7" ,"회색");
		printAll(car3);
	}
}
