package test.t240703;

import java.util.Scanner;

public class T_04 {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 한 개의 값을 입력받아 1부터 입력받은 숫자까지의 숫자를 모두 출력
		 * 단, 입력한 수는 1보다 크거나 같아야한다.
		 * 1 미만의 숫자가 입력됐다면
		 * "1 이상의 숫자를 입력해주세요" 출력, 사용자가 값을 재입력
		 * 
		 * ex) 1 이상의 숫자를 입력하세요 : 4
		 * 1 2 3 4
		 * 
		 * 1이상의 숫자를 입력하세요 : 0
		 * 1 이상의 숫자를 입력해주세요.
		 * 1 이상의 숫자를 입력하세요 : 8
		 * 1 2 3 4 5 6 7 8
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num > 0) {
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}

}
