package org.dimigo.oop;

public class SnackTest {
	public static void main(String[] args){
		Snack a = new Snack("»õ¿ì±ø", "³ó½É", 1100, 2);
		Snack b = new Snack("ÄÜ¯…","Å©¶ó¿î", 1200, 1);
		Snack c = new Snack("Çã´Ï¹öÅÍÄ¨","ÇØÅÂ", 1500, 4);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
	}
}
