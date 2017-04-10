package org.dimigo.oop;

public class SnackTest {
	public static void main(String[] args){
		Snack[] a = new Snack[3];
		int sum = 0;
		Snack a[0] = new Snack("货快兵", "丑缴", 1100, 2);
		Snack a[1] = new Snack("能瘏","农扼款", 1200, 1);
		Snack a[2] = new Snack("倾聪滚磐抹","秦怕", 1500, 4);
		
		for(int i=0;i<3;i++){
		    System.out.println(a[i].toString());
		    sum += a[i].calcPrice();
		}
		System.out.println(sum);
	}
}
