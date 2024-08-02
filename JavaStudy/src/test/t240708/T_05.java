package test.t240708;

import java.util.Scanner;

public class T_05 {
	public static void main(String[] args) {
		/*
		 * 키보드로 2개의 정수형 데이터를 입력받아,
		 * 두 수가 모두 1부터 9까지의 수일때만
		 * 두 수의 곱이 한자리 수인지 두자리 수인지 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if((1 <= num1 && num1 <= 9) && (1 <= num2 && num2 <= 9)) {
//			int sum = num1 * num2;
//			if(sum <= 9) {
//				System.out.println("한자리 수");
//			}else {
//				System.out.println("두자리 수");
//			}
			System.out.println((num1 * num2 <= 9) ? "한자리수 " : "두자리 수");
		}
	}
}
