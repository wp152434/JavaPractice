package org.dimigo.inheritance;

public class Japanese extends Person{

	public Japanese(String name) {
		super(name);
		this.setName(name);
	}
	
	public void sayHello(){
		System.out.println("오하이요");
	}
	
	public void sayBye(){
		System.out.println("사요나라");
		
	}

	public String toString() {
		return "저는 일본사람 "+this.getName()+"입니다.";
	}
}
