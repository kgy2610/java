package test.t240708;

public class T_07 {

	public static void main(String[] args) {
		/*
		 * 배열에 들어있는 데이터 중 홀수의 값들을 출력, 합 구하기
		 * 단, continue 이용하여 작성
		 * 
		 * 사용데이터 : int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 */
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double sum = 0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i] % 2 == 1) {
				System.out.print(array[i] + " ");
				sum += array[i];
			}
		}
		System.out.println();
		System.out.println("합계 : " + sum);

	}

}
