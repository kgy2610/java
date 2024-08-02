package d.loop;

import java.util.Scanner;

public class C_do_while {
	/*
	 * do-while문
	 * 
	 * do{
	 * 		실행할 코드
	 * } while(조건식);
	 * 
	 * 처음에 무조건 실행코드 한 번 실행하고 조건문 검사
	 * 
	 * * 기존의 for/while문과의 차이점
	 * for/while문은 처음 수행될 때 조건검사 후 true일 경우 반복 코드를 실행
	 * do-while문은 첫 실행은 조건 검사 없이 무조건 실행 이후 조건이 true일 경우 반복
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//사용자가 입력한 수를 계속해서 더하는 프로그램을 작성
		// 단, 사용자가 0을 입력하면 종료
		
		int sum = 0;
		int num;
		
		do {
			System.out.println("[현재 입력된 정수들의 합 : " + sum + "]");
			System.out.print("정수를 입력하세요 : ");
			num = sc.nextInt();
			sum += num;
			
		}while(num != 0);
	}
}
