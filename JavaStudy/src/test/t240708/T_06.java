package test.t240708;

import java.util.Scanner;

public class T_06 {
	public static void main(String[] args) {
		/*
		 * 키보드로 한 개의 정수형(int) 데이터를 입력받아
		 * 1부터 5까지일때만 해당 숫자에 해당하는 결과를 출력
		 * 단, switch문 이용
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
			case 1 :
				System.out.println("** 입력이 정상적으로 되었습니다! **");
				break;
			case 2 :
				System.out.println("** 조회가 시작되었습니다! **");
				break;
			case 3 :
				System.out.println("** 수정이 정상적으로 되었습니다! **");
				break;
			case 4 :
				System.out.println("** 삭제가 정상적으로 되었습니다! **");
				break;
			case 5 :
				System.out.println("** 정상적으로 종료 되었습니다! **");
				break;
			default : 
				System.out.println("** 다시 입력해주세요! **");
		}
	}

}
