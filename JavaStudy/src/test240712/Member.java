package test240712;

public class Member {
	private String id;
	private String name;
	private String pw;
	private String email;
	private char gender;
	private int age;
	
	public Member() {}
	public Member(String Id, String Name, String Pw, String Email, char Gender, int Age) {
		this.id = Id;
		this.name = Name;
		this.pw = Pw;
		this.email = Email;
		this.gender = Gender;
		this.age = Age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String inform() {
		return this.id + this.name + this.pw + this.email + this.gender + this.age;
	}
}