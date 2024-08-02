package test.t240709.object1;

public class Run {
	public static void main(String[] args) {
		Member gy = new Member();
		gy.changeName("김가영");
		gy.printName();
		
		// 아이디, 비밀번호, 이름을 초기화하는 생성자를 통해
		// 객체를 하나 생성하고 printName()을 통해 이름을 출력해라
		Member gayeong = new Member("kgy2610", "1234", "김가영");
		gayeong.printName();
	}
}
