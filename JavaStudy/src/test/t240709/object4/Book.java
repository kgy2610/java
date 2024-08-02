package test.t240709.object4;

public class Book {
	// === 필드 ===
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	// === 생성자 ===
	public Book() {}
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	// === 메소드(기능) ===
	public void inform() {
		System.out.println("제목 : " + this.title);
		System.out.println("출판사 : " + this.publisher);
		System.out.println("작가 : " + this.author);
	}
	public void Inform() {
		System.out.println("제목 : " + this.title);
		System.out.println("출판사 : " + this.publisher);
		System.out.println("작가 : " + this.author);
		System.out.println("가격 : " + this.price + "원");
		System.out.println("할인율 : " + this.discountRate + "%");
	}
}
