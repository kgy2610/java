package c.controll;

import java.util.Scanner;

public class A_if2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 나이를 입력받아
		// 13세 이하 : 어린이
		// 13세 초과 19세 이하 : 청소년
		// 19세 초과 : 성인
		
		// 나이를 입력해주세요 : xx
		// xx세는 xxx에 속합니다.
		
		/*
		int age;
		System.out.print("나이를 입력해주세요 : ");
		age = sc.nextInt();
		
		 if(age < 13) {
			System.out.println(age + "세는 어린이에 속합니다.");
		}else if((13 < age) && (age <= 19)) {
			System.out.println(age + "세는 청소년에 속합니다.");
		}else {
			System.out.println(age + "세는 성인에 속합니다.");
		}
		*/
		
		// 성별을 (m/f)(대소문자 상관x)로 입력받아 남학생인지 여학생인지
		// 출력하는 프로그램을 작성하세요
		
		//성별(m/f) : x
		// 여학생입니다 / 남학생입니다 / 잘못입력하셨습니다.
		/*
		char sex;
		System.out.print("성별을 입력하세요(m/f) : ");
		sex = sc.next().charAt(0);
		
		if((sex == 'm') || (sex == 'M')){
			System.out.println("남학생입니다.");
		}else if((sex == 'f') || (sex == 'F')){
			System.out.println("여학생입니다.");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		*/
		
		//정수(양수)를 입력받아
		//짝수인지 홀수인지 출력하는 프로그램을 작성해라
		
		//정수입력 : x
		//짝수 / 홀수 / 양수가 아닙니다
		
		int num;
		System.out.print("정수(양수)를 입력하세요 : ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else if(num < 0) {
			System.out.println("양수가 아닙니다");
		}else{
			System.out.println("홀수");
		}
	}
}
