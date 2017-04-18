package org.dimigo.oop;

public class PiggyBank {
	static private int balance = 0;
	
	static public void putMoney(FamilyMember member, int amount){
		System.out.println(member.getMemberName()+" : "+amount+"원 넣음");
		balance += amount;
	}
	
	static public void printBalance(){
		System.out.println("돼지저금통 총 금액 "+balance+"원");
	}
}
