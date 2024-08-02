package test.t240708;

public class T_02 {
	public static void main(String[] args) {
		/*
		 * 2단에서 5단까지의 구구단 결과 중 홀수인 것만 출력
		 * 단, for문 이용
		 */
		for(int i=0; i<=9;i++) {
			for(int j=2; j<=5;j++) {
				if((j * i) % 2 == 1) {
					System.out.println(j + " * " + i + " = " + (j * i));
				}
			}
		}
	}
}
