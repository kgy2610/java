package a.basic;

public class Output {
	public static void main(String[] args)  {
		//한줄을 출력하고 개행을 하는 출력문
		System.out.println("안녕하세요.");
		System.out.println("김가영입니다.");
		
		//단순하게 출력을 할 때 사용하는 출력문
		System.out.print("제 성별은\n");
		//print에서 개행을 하고싶을 때는 \n을 이용한다.
		System.out.print("여자입니다.");
		
		String name="김가영";
		System.out.println("안녕하세요 저는 " + name + "입니다.");
		
		//System.out.printf(문자열포멧, 값1, 값2)
		/*
		 * 포멧 안에서 쓸 수 있는 키워드
		 * %d : 정수
		 * %c : 문자
		 * %s : 문자열
		 * %f : 실수(소수점 아래로 원하는 만큼 표시하기 위해서는 %.nf)
		 */
		System.out.printf("안녕하세요 제 이름은 %s입니다. 나이는 %d이고, 키는 %.1f입니다.", name, 23, 163.5);
	}
}
