package test.t240709.object4;

public class Run {
	public static void main(String[] args) {
		Book potato = new Book("감자이야기", "감자나라 출판사", "신서희");
		potato.inform();
		
		System.out.println();
		
		Book Potato = new Book("감자이야기", "감자나라 출판사", "신서희", 12000, 20);
		Potato.Inform();
	}
}
