package i.polmorphism.ex1;

public class Run {
	public static void main(String[] args) {
		/*
		 	클래스 참조 변수 = new 클래스 생성자;
    (부모클래스가 올 수 있다 ) / (자식클래스로 생성)
    실제로 어디까지 접근이 가능 / 실제로 어떤 형태의 메모리가 생성되는가
		 */
		
		Cake c1 = new CheeseCake();
		//Cake까지 접근 가능, 메모리 공간은 실제 CheeseCake
		
		c1.sweet();
		c1.yummy();
		//오버라이딩시에는 실제 메모리에 있는 재정의된 메서드가 호출됨

		// CheeseCake ch2 = new Cake();
		// 실제 메모리 공간이 Cake이므로 CheeseCake공간에 접근할 수 없다
		
		
	}
}
