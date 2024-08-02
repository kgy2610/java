package test.t240703;

import java.util.Scanner;

public class T_02 {
	public static void main(String[] args) {
		/*
		 * 키보드로 정수를 입력받아 정수가 양수이면서 짝수일 때만 "짝수" 출력
		 * 짝수가 아니면 "홀수"를 출력
		 * 양수가 아니면 "양수만 입력해주세요." 출력
		 * 
		 * ex)
		 * 숫자를 한 개 입력하세요 : -8
		 * 양수만 입력해주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if((num > 0) && (num % 2 == 0)) {
			System.out.print("짝수");
		}else if((num > 0) && (num % 2 != 0)) {
			System.out.print("홀수");
		}else {
			System.out.print("양수만 입력하세요.");
		}
	}
}
