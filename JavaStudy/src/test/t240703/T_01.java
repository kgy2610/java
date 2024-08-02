package test.t240703;

import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		/*
		 * 메뉴를 출력하고 메뉴 번호를 입력하면 "xx 메뉴 입니다." 출력,
		 * 종료 버튼을 누르면 "프로그램이 종료됩니다."를 출력
		 * 
		 * 1. 입력 2. 수정 3. 조회 4. 삭제 7. 종료
		 * 메뉴번호를 입력하세요 : 3 (사용자 입력)
		 * 조회메뉴입니다
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력 \n2. 수정 \n3. 조회 \n4. 삭제 \n7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : "); 
		String num = sc.next();
		
		switch(num) {
			case "1", "입력" :
				System.out.println("입력 메뉴입니다.");
				break;
			case "2", "수정" :
				System.out.println("수정 메뉴입니다.");
				break;
			case "3", "조회" :
				System.out.println("조회 메뉴입니다.");
				break;
			case "4", "삭제" :
				System.out.println("삭제 메뉴입니다.");
				break;
			case "7", "종료" :
				System.out.println("프로그램이 종료됩니다.");
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
		}
	}
}
