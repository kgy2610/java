package q.thread.ex1;

public class Task extends Thread{
	// 쓰레드 생성 방법 1
	// Thread를 상속 받는 클래스를 작성
		
	// 메인문 처럼 독립적으로 실행될 수 있는 메소드
	@Override
	public void run() {
		int n1 = 20;
		int n2 = 30;
		
		//currentThread() : 지금 실행하고 있는 쓰레드의 정보객체를 반환
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + (n1 + n2));
	}
}
