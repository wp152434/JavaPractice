package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 		|_ PrimitiveDataType
 * 
 * 1.  개요 : 아이유 프로필 출력하기
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 *
 * @author 			: choichanhwan
 * @version 		: 1.0
 *
 */
public class PrimitiveDataType {
	public static void main(String[] args){
		String name="아이유";
		boolean isMale=false;
		int age = 25;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		System.out .println(name);
		System.out .println(isMale?"남자":"여자");
		System.out .println(age);
		System.out .println(height);
		System.out .println(weight);
		System.out .println(bloodType);
	}
}
