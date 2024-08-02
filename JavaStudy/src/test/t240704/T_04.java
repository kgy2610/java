package test.t240704;

import java.util.Scanner;

public class T_04 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		/*
		 * 사용자로부터 입력받은 숫자의 단부터 9단까지 출력
		 * 단, 9를 초과하는 숫자가 들어오면 "9이하의 숫자만 입력해주세요"를 출력하세요
		 */
	    
	    System.out.print("정수를 입력해주세요 : ");
	    int num = sc.nextInt();

	    if(num <= 9) {
		   for(int i=num; i<=num; i++) {
			   System.out.println(" ===== " + i + "단 =====");
			   for(int j=1; j<=9; j++) {
				   System.out.println(i + " * " + j + " = " + i*j);
				}
		   }
	    }else {
	    	System.out.println("9 이하의 숫자만 입력해주세요");
	    }
	    }
}
