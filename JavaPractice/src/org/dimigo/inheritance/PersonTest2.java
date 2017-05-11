package org.dimigo.inheritance;

public class PersonTest2 {
	public static void main(String[] args){
		Person person[] = {
				new Person("Tom"),
				new Korean("È«±æµ¿"),
				new Japanese("´Ù³ªÄ«"),
				new Chinese("¿Õ¹Ö")
		};
		
		for(int i=0;i<3;i++){
			greeting(person[i]);
		}
	}
	private static void greeting(Person p){
		System.out.println(p.toString());
		p.sayHello();
		p.sayBye();
	}
}
