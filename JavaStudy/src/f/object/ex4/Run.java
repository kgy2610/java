package f.object.ex4;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// kim 객체 생성 김가영, 17살, 수학 : 80, 영어 : 60, 국어 : 80
		// shin 객체 생성 신감자, 19살, 수학 : 90, 영어 : 70, 국어 : 80
//		Student kim = new Student("김가영", 17, 80, 60, 80);
//		Student shin = new Student("신감자", 19, 90, 70, 80);
//		
//		// kim의 모든 과목의 평균 출력
//		System.out.println(kim.getName() + "님의 평균 : " + kim.getEvg());
//		// shin의 모든 과목 평균 출력
//		System.out.println(shin.getName() + "님의 평균 : " + shin.getEvg());
		
		/*
		 	사용자로부터 이름, 나이, 영어점수, 수학점수, 국어점수를 입력받아
		 	평균을 구하고 출력하는 프로그램 작성
		 	ex) 이름 : 김가영
		 		영어점수 : 80
		 		수학점수 : 100
		 		국어점수 : 75
		 		김가영님의 평균 : 85
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("영어, 수학, 국어 점수 차례대로 입력 : ");
		int en = sc.nextInt();
		int math = sc.nextInt();
		int ko = sc.nextInt();
		
		Student user = new Student(name, age, en, math, ko);
		
		System.out.println("이름 : " + user.getName());
		System.out.println("나이 : " + user.getAge());
		System.out.println("영어점수 : " + user.getEnScore());
		System.out.println("수학점수 : " + user.getMathScore());
		System.out.println("국어점수 : " + user.getKoScore());
		user.printEvg();

		
		
	}

}
