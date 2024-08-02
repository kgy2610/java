package test.t240704;

import java.util.Scanner;

public class T_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 사용자에게 입력받은 정수만큼 배열의 크기를 할당하고
		 * 1부터 입력받은 값까지 배열에 초기화한 후 출력
		 * 
		 * ex)
		 * 양의 정수 : 5
		 * 1 2 3 4 5
		 */
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] num2 = new int[num];
		for(int i=0; i<num2.length; i++) {
			num2[i] = i + 1;
		}
		for(int i=0; i<num2.length; i++) {
			System.out.print(num2[i] + " ");
		}
	}
}
