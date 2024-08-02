package test.t240708;

import java.util.Scanner;

public class T_04 {

	public static void main(String[] args) {
		/*
		 * main의 argument로 1자리 정수형(1부터 9까지만) 값을 2개 입력받아
		 * 사칙연산 결과 출력
		 * 입력값은 모두 int 처리
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[2];
		
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();

		System.out.println("합 : " + (arr[0] + arr[1]));
		System.out.println("차 : " + (arr[0] - arr[1]));
		System.out.println("곱 : " + (arr[0] * arr[1]));
		System.out.println("나누기 : " + (arr[0] / arr[1]));
	}

}
