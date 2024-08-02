package f.object.ex4;

// 이름 나이 수학점수 영어점수 국어점수를 데이터로 가지고 있는 개체 생성
// 데이터는 직접 접근을 허용하지 않고 모두 간접적으로 set/get을 해줄 수 있도록 작성
// 모든 데이터를 매개변수로 받아 초기화하면서 객체를 생성할 수 있는 생성자를 작성
public class Student {
	// 필드영역(데이터)
	private String name;
	private int age;
	private int mathScore;
	private int enScore;
	private int koScore;
	
	// 생성자 영역
	public Student() {}
	
	public Student(String name, int age, int mathScore, int enScore, int koScore) {
		super();
		this.name = name;
		this.age = age;
		this.mathScore = mathScore;
		this.enScore = enScore;
		this.koScore= koScore;
	}
	// 메소드영역(기능)
	//getter, setter
	// alt + shift + s -> r
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public int getMathScore() {
		return this.mathScore;
	}
	public int getEnScore() {
		return this.enScore;
	}
	public int getKoScore(){
		return this.koScore;
	}
	public double getEvg() {
		double evg = (this. mathScore + this.enScore + this.koScore) / 3.0;
		return evg;
	}

	public void setMathScore(int mathScore) {
		if(mathScore < 0) {
			this.mathScore = 0;
			return;
		}
		this.mathScore = mathScore;
	}
	public void setEnScore(int enScore) {
		if(enScore < 0) {
			this.enScore = 0;
			return;
		}
		this.enScore = enScore;
	}
	public void setKoScore(int koScore) {
		if(koScore < 0) {
			this.koScore = 0;
			return;
		}
		this.koScore = koScore;
	}
	
	public void printEvg() {
		System.out.println(this.getName() + "님의 평균 : " + this.getEvg());
	}
}
