package test240711.object1;

import java.util.Scanner;

public class T_02 {

	public static void main(String[] args) {
		// 정수 num을 입력받아 크기가 num인 정수형 배열을 만들고 1~100 사이의 랜덤값으로
		// 모든 배열의 인덱스 값을 대입
		// 이후 모든 배열의 값을 출력, 홀수 인덱스의 값을 더한 값 출력
		
		// 5 42 3 10 5
		// 홀수 index의 합 : 13

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		int arr[] = new int[num];
		
		// 1~100 중 랜덤값을 통해 배열 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			if(i % 2 == 1) {
				sum += arr[i];
			}
		}
		System.out.print("\n홀수 index의 합 : " + sum);
	}

}
