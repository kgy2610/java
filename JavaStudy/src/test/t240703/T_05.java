package test.t240703;

import java.util.Scanner;

public class T_05 {

	public static void main(String[] args) {
		/*
		 * 1부터 사용자에게 입력받은 수들까지의 정수들의 합을 출력하세요.
		 * 
		 * ex)
		 * 정수를 하나 입력하세요 : 8
		 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<=num; i++) {
			sum += i;
		}
		
		
		int[] arr = new int[num];
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		System.out.print(arr[0]);
		for(int i=1; i<arr.length; i++) {
			System.out.print(" + " + arr[i]);
		}
		
		System.out.print(" = " + sum);
	}

}
