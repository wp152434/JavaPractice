/**
 * 
 */
package org.dimigo.basic;
import java.util.Scanner;
import java.util.Random;
/**
 * <pre>
 * org.dimigo.basic
 * 		|_ Loop
 * 
 * 1.  개요 :
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 *
 * @author 			: choichanhwan
 * @version 		: 1.0
 *
 */
public class Loop {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int n, attack=100, rand;
		String[] job = {"마법사", "영주", "기사", "농민"};
		for(;;){
			System.out.print("<<게임메뉴>>\n1. 공격력 증가\n2. 공격력 감소\n3. 캐릭터 설정\n9.종료\n메뉴 입력 => ");
			n = scanner.nextInt();
			switch(n){
				case 1:
					attack += 10;
					System.out.println(" 공격력이 증가되었습니다. 현재 공격력 : "+attack);
					break;
				case 2:
					attack -= 10;
					System.out.println(" 공격력이 감소되었습니다. 현재 공격력 : "+attack);
					break;
				case 3:
					rand = random.nextInt(3);
					switch(rand){
						case 0:
							System.out.println("마법사");
							break;
						case 1:
							System.out.println("영주");
							break;
						case 2:
							System.out.println("기사");
							break;
						case 3:
							System.out.println("농민");
							break;
					}
					break;
				case 9:
					System.out.println("ㅃㅃ");
					break;
				default:
					System.out.println("없는 메뉴 입니다!!");
					break;
			}
			if(n == 9)
				break;
		}
	}
}
