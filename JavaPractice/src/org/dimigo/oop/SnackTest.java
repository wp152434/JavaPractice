package org.dimigo.oop;

public class SnackTest {
	public static void main(String[] args){
		Snack[] a = null;
		a = new Snack[3];
		int sum = 0;
		a[0] = new Snack("새우깡", "농심", 1100, 2);
		a[1] = new Snack("콘칩","크라운", 1200, 1);
		a[2] = new Snack("허니버터칩","", 1500, 4);
		
		for(int i=0;i<3;i++){
		    System.out.println(a[i].toString());
		    sum += a[i].calcPrice();
		}
		System.out.println(sum);
	}
}
