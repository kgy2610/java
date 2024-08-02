package test240719.object2;

public class Company {
	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales", 1200);
		
		System.out.println("name\t department\t salary");
		System.out.println("--------------------------------");
		for(Employee e : employees) {
			System.out.println(e.getName() + "\t " + e.getDepartment() + "\t " + e.getSalary());
		}
		
		System.out.println();
		
		System.out.println("인센티브 100지급");
		((Secretary)employees[0]).incentive(100);
		((Sales)employees[1]).incentive(100);
		
		System.out.println("name\t department\t salary\t \tax");
		System.out.println("--------------------------------");
		for(Employee e : employees) {
			System.out.println(e.getName() + "\t " + e.getDepartment() + "\t " + e.getSalary() + "\t " + e.tax());
		}
		// 1번의 사용 데이터를 기반으로 객체를 생성하여 배열에 넣는다 . 
		// 모든 객체의 기본 정보를 출력핚다 (for 문을 이용하여 출력핚다.) 
		 // 모든 객체에 인센티브 100 씩 지급핚 급여를 계산하고 다시 객체의 salary에 넣는다 . 
		 // 모든 객체의 정보와 세금을 출력핚다 (for 문을 이용하여 출력핚다.)

	}
}
