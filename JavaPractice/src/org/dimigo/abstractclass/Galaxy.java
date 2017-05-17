package org.dimigo.abstractclass;

import org.dimigo.abstractclass.SmartPhone;

public class Galaxy extends SmartPhone{

	public Galaxy() {
		super();
	}

	public Galaxy(String model, String company, int price) {
		super(model, company, price);
	}
	
	@Override
	public void pay(){
		System.out.println("삼성 페이로 결제 합니다.");
	}
	
	public void useWirelessCarging(){
		System.out.println("무선 충전 기능을 이용합니다.");
	}
}
