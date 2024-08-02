package test.t240704;

import java.util.Scanner;

public class T_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 사용자로부터 두 개의 값을 입력받아 그 사이의 숫자를 모두 출력
		 * 만일 1 미만의 숫자가 입력됐다면, " 1이상의 숫자를 입력해주세요"를 출력
		 * 
		 * ex)
		 * 첫 번째 숫자 : 8
		 * 두 번째 숫자 : 4
		 * 4 5 6 7 8
		 * 
		 * ex)
		 * 첫 번째 숫자 : 9
		 * 두 번째 숫자 : 0
		 * 1 이상의 숫자를 입력해주세요.
		 */
		
		int num1, num2, max, min;
		
		System.out.print("첫 번째 숫자 : ");
		num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		num2 = sc.nextInt();
		
		// 둘 중 더 큰 수 구하기
		max = (num1 > num2) ? num1 : num2;
		min = (num1 < num2) ? num1 : num2;
		
		for(int i=min; i<=max; i++) {
			System.out.print(i + " ");
		}
	}
}
