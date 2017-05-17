package org.dimigo.abstractclass;

import org.dimigo.abstractclass.*;

public class SmartPhoneTest {
	public static void main(String[] args){
		SmartPhone[] phone = {
				new IPhone("iPhone 7", "¾ÖÇÃ", 900000),
				new Galaxy("°¶·°½Ã S8", "»ï¼º", 800000)
		};
		
		for(int i=0;i<2;i++){
			System.out.println(phone[i]);
			phone[i].turnOn();
			phone[i].pay();
			phone[i].useSpecialFunction(phone[i]);
			phone[i].turnOff();
		}
	}
}
