package test.t240708;

public class T_03 {

	public static void main(String[] args) {
		/*
		 *  1부터 100까지의 모든 정수들의 합과 평균을 구하는 프로그램
		 *  단, while문 또는 do while문을 이용
		 */
		int sum = 0;
		
//		for(int i=1; i<=100; i++) {
//			sum += i;
//		}
		
		int i = 1;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum / 100.0));
		// 100.0으로 하는 이유 : sum -> 실수 | 100.0 -> 실수
	}

}
