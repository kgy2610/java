package test240711.object1;

import java.util.Scanner;

public class T_01 {

	public static void main(String[] args) {
		// 정수 n(2~9)를 입력 받아 2부터 n까지 중 짝수의 구구단을 출력하는 코드 작성
		// 만약 2~9사이에 값을 입력하지 않는다면 다시 입력하세요 반복
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("2부터 9 사이의 정수를 입력 : ");
			int num = sc.nextInt();
			
			if(2 > num || num > 9) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			
			for(int i=2; i<=num; i++) {
				for(int j=1; j<=9; j++) {
					if(2 <= num && num <= 9 && i % 2 == 0) {
						System.out.println( i + " * " + j + " = " + (i*j));
					}
				}
			}
			break;
		}
		
	}

}
