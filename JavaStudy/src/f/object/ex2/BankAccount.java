package f.object.ex2;

public class BankAccount {
	// 필드영역
	int balance;
	
	// 메소드 영역
	// void : 메소드의 결과로 반환되는 것이 없음
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}
	
	public void checkMyBalance() {
		// 영역 안에서 변수를 찾을 때는 가장 작은 단위부터 탐색
		// 지역 변수 우선 -> 이후 필드값
		// this 키워드 사용 시 접근한 객체의 필드 값을 가져올 수 있다
		System.out.println("잔액 : " + this.balance);
	}
}
