package org.dimigo.oop;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private static Singleton singleton2; 
	private Singleton(){
	}
	
	public static Singleton getInstance() {
		return singleton;
	}

	public static synchronized Singleton getLazyInstance() {
		if (singleton2 == null)
			singleton2 = new Singleton();
		return singleton2;
	}
}
