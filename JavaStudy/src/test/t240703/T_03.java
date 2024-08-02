package test.t240703;

import java.util.Scanner;

public class T_03 {
	public static void main(String[] arg) {
		/*
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력받고 합계와 평균을 계산,
		 * 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능 구현
		 * 
		 * 합격 조건 : 세 과목의 점수가 각각 40점 이상이고, 평균 60점 이상
		 * 합격했을 경우 과목별 점수와 합계, 평균, "축하합니다, 합격입니다!" 출력
		 * 불합격했을 경우 "불합격입니다." 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int Kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int Eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int Mat = sc.nextInt();
		
		double Ave = (Kor + Eng + Mat)/3;
		
		if((Kor > 40) && (Eng > 40) && (Mat > 40) && (Ave > 60)) {
			System.out.println("[각 과목별 점수]");
			System.out.println("국어 : " + Kor + "\n영어 : " + Eng + " \n수학 : " + Mat);
			System.out.println("평균 : "+ Ave);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("국어 : " + Kor + "\n영어 : " + Eng + " \n수학 : " + Mat);
			System.out.println("평균 : " + Ave);
			System.out.println("불합격입니다.");
		}
	}
}
