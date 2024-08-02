package b.operator;

public class Operator2 {
	/*
	 * 증감 연산자
	 * 
	 * ++ : 변수에 담긴 값을 1 증가 시켜주는 연산자
	 * -- : 변수에 담긴 값을 1 감소 시켜주는 연산자
	 * 
	 * 
	 * (증감연산)변수 : 전위연산 -> "선 증감" 후 처리 
	 * 변수(증감연산) : 후위연산 -> "선 처리" 후 증감
	 */
	public static void main(String[] args) {
		int num1 = 0;
		
		System.out.println(num1++); //0(1)
		System.out.println(++num1); //2(2)
		System.out.println(num1--); //2(1)
		System.out.println(++num1); //2(2)
		System.out.println(++num1); //3(3)
		System.out.println(++num1); //4(4)
		System.out.println(num1++); //4(5)
		System.out.println(--num1); //4(4)
		System.out.println(--num1); //3(3)
	}
}
