package b.operator;

import java.util.Scanner;

public class Operator6 {
	/*
	 *  삼항연산자
	 *  [표현식]
	 *  조건식 ? 조건식이 참일 경우 결과 값 : 조건식이 거짓일 경우 결과값
	 *  
	 *  이때, 조건식은 반드시 true 또는 false가 나오는 논리값이여야 한다.
	 *  주로 비교, 논리연산자를 통해서 작성
	 */
	public static void main(String[] args) {
		/*
		int num = (3 > 10) ? 10 : 20;
		System.out.println(num);
		*/
		
		// 입력 받은 정수 값이 양수인지 아닌지  판별 후 출력해라
		// 정수 값 입력 :
		// 양수/음수
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.print("숫자 입력 : ");
		num1 = sc.nextInt();
		
//		String res1 = (num1 > 0) ? "양수" : "음수";
//		System.out.println("입력하신 숫자는 " + res1 + "입니다.");
		
		String res1;
		if(num1 > 0) {
			res1 = "양수입니다.";
		} else if(num1 == 0){
			res1 = "0입니다.";
		} else {
			res1 = "음수입니다.";
		}
		System.out.println("입력하신 숫자는 " + res1);
	}
}
		
		