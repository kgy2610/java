package test240711.object4;

public class StudentController {
	private Student[] sArr = new Student[5];
	public final int CUT_LINE = 60;
	// 상수 선언으로 커트라인 60 고정
	
	public StudentController() {
		// 초기화 : 한 번도 사용하지 않은 배열에 값을 넣는 것
		super();
		sArr[0] = new Student("김길동" , "자바", 100);
		sArr[1] = new Student("박길동" , "디비", 50);
		sArr[2] = new Student("이길동" , "화면", 85);
		sArr[3] = new Student("정길동" , "서버", 60);
		sArr[4] = new Student("홍길동" , "자바", 20);
	}
	
	public Student[] printStudent() {
		// 객체 배열에 있는 데이터 반환
		return sArr;
	}
	
	public int sumScore() {
		int sum = 0;
		for(int i=0; i<sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		// int형은 null 대신 0
		return sum;
	}
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = this.sumScore(); // 0번째 index에 모든 점수의 합 저장
		avgArr[1] = this.sumScore() / sArr.length; // 1번째 index에 평균 저장
		return avgArr;
	}
}
