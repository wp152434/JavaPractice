/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 		|_ Operator
 * 
 * 1.  개요 :
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *
 * @author 			: choichanhwan
 * @version 		: 1.0
 *
 */
public class Operator {
	public static void main(String[] args){
		long month_avg=1700000, man=3, num=1500;
		long money;
		money = month_avg * 12 * man * num;
		System.out.println(String.format("%,d", money));
	}
}
