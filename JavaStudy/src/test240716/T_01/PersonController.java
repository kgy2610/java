package test240716.T_01;

public class PersonController {
	private Student[] s = new Student[3];
//	public static final int SIZE1 = 3;
//	public int existStudentNum() {
//		int count = 0;
//		for(int i=0; i<s.length; i++) {
//			if(s[i] != null) {
//				count++;
//			}else {
//				break;
//			}
//		}
//		return count;
//	}
	
	private Employee[] e = new Employee[10];
//	public static final int SIZE2 = 10;
//	public int existEmployeeNum() {
//		int count = 0;
//		for(int i=0; i<e.length; i++) {
//			if(e[i] != null) {
//				count++;
//			}else {
//				break;
//			}
//		}
//		return count;
//	}
	
	public int[] personCount() {
		int[] countArr = new int[2];
		int studentCount = 0, employeeCount = 0;
		for(int i=0; i<s.length; i++) {
			if(s[i] == null) {
				break;
			}
			studentCount++;
		}
		
		for(Employee emp : e) {
			if(emp == null) {
				break;
			}
			employeeCount++;
		}
		
		countArr[0] = studentCount;
		countArr[1] = employeeCount;
		
		return countArr;
	}
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i=0;i<s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				return;
			}
		}
	}
	public Student[] printStudent() {
		return this.s;
	}
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i=0; i<e.length;i++) {
			if(e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				return;
			}
		}
	}
	public Employee[] printEmployee() {
		return this.e;
	}
}
