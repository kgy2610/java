package test.t240704;

import java.util.Scanner;

public class T_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 4행 4열짜리 정수형 배열을 선언 및 할당
		 * 1) 16 ~ 1과 같이 값을 거꾸로 저장
		 * 2) 저장된 값들을 차례대로 출력
		 * 
		 * ex)
		 * 16 15 14 13
		 * 12 11 10 9
		 * 8  7  6  5
		 * 4  3  2  1
		 */
		
		int[][] str = new int[4][4];
		int value = 16;
		
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str[i].length; j++) {
				str[i][j] = value--;
			}
		}
		
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str[i].length; j++) {
				System.out.print(str[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
