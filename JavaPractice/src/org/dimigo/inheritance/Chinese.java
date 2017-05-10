package org.dimigo.inheritance;

public class Chinese extends Person{

	public Chinese(String name) {
		super(name);
		this.setName(name);
	}
	
	public void sayHello(){
		System.out.println("니하오");
	}
	
	public void sayBye(){
		System.out.println("쨔이찌엔");
	}

	public String toString() {
		return "저는 중국사람 "+this.getName()+"입니다.";
	}
}
