package test.t240704;

import java.util.Scanner;

public class T_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 문자열을 입력받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가있는지
		 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		 * 
		 * ex)
		 * 문자열 : application
		 * 문자 : i
		 * application에 i가 존재하는 위치(index) : 4 8
		 */
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0); // 사용자가 입력한 문자 중 첫번째 문자만 저장
		
		char[] chArr = new char[str.length()];
		for(int i=0; i<chArr.length; i++) {
			chArr[i] = str.charAt(i);
		}
		
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(index) : ");
		// str에서 i 위치
		int count = 0;
		for(int i=0; i<chArr.length; i++) {
			if(chArr[i] == ch) { // 문자열에서 가져온 n번째 문자와 입력받은 문자 비교
				System.out.print(i + " "); // index -> 0부터 시작, 몇 번째 자리 -> i+1
				count++;
			}
		}
		System.out.println();
		System.out.println(ch + " 갯수 : " + count);
	}
}
