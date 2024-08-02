package test240711.object3;

public class Book {
	private String title;
	private String kind;
	private String author;
	private int booknum;
	
	public Book() {}
	public Book(String Title, String Kind, String Author, int Booknum) {
		super();
		this.title = Title;
		this.kind = Kind;
		this.author = Author;
		this.booknum = Booknum;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getBooknum() {
		return booknum;
	}
	public void setBooknum(int booknum) {
		this.booknum = booknum;
	}
	public String toString() {
		return "제목: " + this.title + "\n장르 : " + this.kind + "\n저자 : " + this.author + "\n책 번호 : " + this.booknum;
	}
}
