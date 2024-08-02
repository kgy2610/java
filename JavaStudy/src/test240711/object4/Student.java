package test240711.object4;

public class Student {
	private String name;
	private String subject;
	private int score;
	
	public Student() {
		super();
	}
	public Student(String Name, String Subject, int Score) {
		super();
		this.name = Name;
		this.subject = Subject;
		this.score = Score;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String inform() {
		return "이름 : " + this.name + "과목 : "  + this.subject + "점수 : " + this.score;
	}
}
