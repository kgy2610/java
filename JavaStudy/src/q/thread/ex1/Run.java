package q.thread.ex1;

public class Run {
	public static void main(String[] args) {
		// 쓰레드 : 프로그램 내에세 실행의 흐름을 가지고 있는 최소 단위
		// main메소드 실행시 메인 쓰레드가 실행되는 것이다.
		Task t1 = new Task();
		// 쓰레드를 상속받아 run을 구현한 객체를 생성한다.
		
		Runnable task = new Task();
		// run을 구현한 객체를 생성해서
		Thread t2 = new Thread(task);
		// thread객체의 생성자에게 넘겨준다.
		
		t1.start();
		t2.start();
		
		System.out.println("END : " + Thread.currentThread().getName());
	}
}
