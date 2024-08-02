package d.loop;

import java.util.Scanner;

public class B_while {
	/*
	 * while문
	 * 
	 * [표현법]
	 * 
	 * [초기식;]
	 * while(조건식){
	 * 		반복할 코드
	 * 		증감식;
	 * }
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		for(int i=0; i<5; i++) {
//			System.out.println("안녕하세요.")
//		}
		
//		while(true) {
//			int n = sc.nextInt();
//			if(n == 0) {
//				break;
//			}else {
//			System.out.println(n);
//			}
//		}
		
		// 1에서부터 10000사이의 홀수만을 출력
		// while문 이용
//		int n = 1;
//		while(n <= 10000) {
//			System.out.print(n + " ");
//			n += 2;
//		}
		
		// 1부터 랜덤값(1~100)까지의 합계
		// 1에서 부터 xx까지의 총 합 : xxxx
		
//		int num = (int)(Math.random() * 100) + 1;
//		int sum = 0;
		
//		for(int i=0; i<=num; i++) {
//			sum+=i;
//		}
//		
//		System.out.println("랜덤으로 뽑힌 숫자는 " + num + "입니다.");
//		System.out.println("1부터 "+ num + "까지의 합은 : " + sum + "입니다.");
		
//		int i = 0;
//		while(i <= num) {
//			sum += i;
//			i++;
//		}
//		System.out.print("1에서 부터 " + num + "까지의 합은 " + sum + "입니다.");
		
		
		// 사용자에게 문자열을 입력 받아
		// 해당 문자열의 짝수자리 글자만 출력
		// 문자열 입력 : hello
		// el
		
		String word;
		System.out.print("문자열 입력 : ");
		word = sc.next();
		
//		for(int i = 1; i<word.length(); i+=2) {
//			System.out.print(word.charAt(i) + " ");
//		}
		
		int i = 1;
		while(i<word.length()) {
			System.out.print(word.charAt(i) + " ");
			i += 2;
		}
	}
}
