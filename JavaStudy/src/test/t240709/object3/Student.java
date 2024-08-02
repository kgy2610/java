package test.t240709.object3;

public class Student {
	// 필드영역
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	// 생성자영역
	public Student() {}
	
	public Student(int grade, int classroom, String name, double height, char gender) {
		super();
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	
	// 메소드 영역(기능)
	public int getGrade() {
		return this.grade;
	}
	public int getClassroom() {
		return this.classroom;
	}
	public String getName() {
		return this.name;
	}
	public double getHeight() {
		return this.height;
	}
	public char getGender() {
		return this.gender;
	}
	
	public void setGrade(int grade) {
		if(1<= grade && grade <= 4) {
			this.grade = 0;
			return;
		}
	}
	
	public void information() {
		System.out.println(this.getName() + "님의 학년 : " + this.getGrade() + "학년");
		System.out.println(this.getName() + "님의 반 : " + this.getClassroom() + "반");
		System.out.println(this.getName() + "님의 키 : " + this.getHeight() + "cm");
		System.out.println(this.getName() + "님의 성별 : " + this.getGender());
	}
}
