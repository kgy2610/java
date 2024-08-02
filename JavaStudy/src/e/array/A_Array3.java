package e.array;

import java.util.Scanner;

public class A_Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		// 1. 크기가 10인 정수형 배열 생성 후
//		int[] IArr = new int[10];
//		// 2. 반복문을 통해서 0번 인덱스부터 마지막 인덱스까지 모든 값을 1로 초기화
//		for(int i=0; i<IArr.length; i++) {
//			IArr[i] = 1;
//		}
//		// 3. 반복문을 통해 0~마지막인덱스까지 전부 출력
//		for(int i=0; i<IArr.length; i++) {
//			System.out.print(IArr[i] + " ");
//		}
		
//		// 4. 사용자에게 배열의 길이를 입력받아 해당 크기의 문자열 배열을 생성해라.
		
//		int num;
//		System.out.print("길이 입력 : ");
//		num = sc.nextInt();
//		
//		String[] arr = new String[num];
//		
//		// 5. 반복문을 활용해서 매번 사용자에게 과일 명을 입력받아 그 값을 strArr에 대입(0~마지막 인덱스)
//		// 좋아하는 과일을 입력 : 바나나
//		
//		for(int i=0; i<arr.length; i++){
//			String fru;
//			System.out.print("좋아하는 과일을 입력하세요 : ");
//			fru = sc.next();
//			
//			arr[i] = fru;
//		}
//		// 6. 반복문을 이용해서 arr에 있는 모든 값을 출력
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		// 사용자에게 문자열 하나 입력 받은 후
		// 각각의 인덱스에 있는 문자들을 char배열에 옮겨 닮기
		
		
//		// 1. 사용자에게 문자열 하나 입력받은 후
//		System.out.print("단어를 입력하세요 : ");
//		String word = sc.next();
//		
//		// 2. char배열 생성하기(길이 = 문자열의 길이)
//		char[] chArr = new char[word.length()];
//		
//		// 3. 반복문을 통해서 해당 문자열에서 각각 인덱스별 문자를 char배열에 각 인덱스 값에 대입
//		for(int i=0; i<chArr.length; i++) {
//			chArr[i] = word.charAt(i);
//		}
//		
//		// 4. char배열의 모든 index값을 전체 출력
//		for(int i=0; i<chArr.length; i++) {
//			System.out.print(chArr[i] + " ");
//		}
		
		// 사용자에게 배열의 길이를 입력받아 해당 길이의 정수형 배열 arr을 생성한다.
		// arr에 모든 인덱스 값에 1~100 사이의 랜덤값을 할당해주고
		// arr에 모든 값을 출력한 후
		// 이 중 짝수인 값의 총 합을 구해서 출력
		
		// 정수 입력 : 3
		// 4 7 15 > 출력
		// 짝수 총 합 : 4
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.print("\n짝수의 총 합 : " + sum);
	}
}
