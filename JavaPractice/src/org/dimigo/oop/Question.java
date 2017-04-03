package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ Question
 * 
 * 1.  개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author 			: choichanhwan
 * @version 		: 1.0
 *
 */
import java.util.*;

public class Question {
    public static void checker(String ans, String input){
        if(ans.equals(input))
            System.out.println("맞았습니다.");
        else
            System.out.println("틀렸습니다.");
    }
    public static void allprint(String[] ans, String[] question){
        int i;
        for(i=0;i<3;i++){
            System.out.println(question[i]+"  "+ans[i]);
        }
    }
	public static void main(String args[]){
        Scanner scanner = new Scanner(System. in);
        int i;
        String[] question = {"1. 가장 좋아하는 가수는?", "2. 가장 좋아하는 배우는?", "3. 가장 좋아하느 과목은?"};
        String[] ans = {"a", "b", "c"};
        for(i=0;i<3;i++){
            System.out.println(question[i]);
            String input = scanner.nextLine();
            checker(input, ans[i]);
        }
        allprint(ans, question);
    }
}