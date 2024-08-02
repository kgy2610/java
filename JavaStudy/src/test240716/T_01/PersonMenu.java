package test240716.T_01;

import java.util.Scanner;

public class PersonMenu {
	Scanner sc = new Scanner (System.in);
	
	PersonController pc = new PersonController();
	
	public void mainMenu() {
		int[] countArr = pc.personCount();
		int choice = 0;
		System.out.println("학생은 최대 "  + "명까지 저장할 수 있습니다.");
		System.out.println("현재 등록된 학생 수는 " + countArr[0] + "명입니다.");
		System.out.println("사원은 최대 "  + "명까지 저장할 수 있습니다.");
		System.out.println("현재 등록된 사원 수는 " + countArr[1] + "명입니다.");
		System.out.println();
		
		while(choice != 9) {
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			
			System.out.print("메뉴 번호 : ");
			
			choice = sc.nextInt();
			
			switch(choice) {
				case 1 :
					this.studentMenu();
					break;
				case 2 :
					this.employeeMenu();
					break;
				case 9 :
					System.out.println("프로그램을 종료합니다.");
					break;
				default :
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void studentMenu() {
		int[] countArr = pc.personCount();
		// 메뉴 번호 입력에서 1번을 입력했을 때 실행될 코드
		int choice = 0;
		
		while(true) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			
			System.out.print("메뉴 번호 : ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1 :
					if(countArr[0] != 3) {
						this.insertStudent();
						break;
					}else {
						System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더이상 활성화 되지 않습니다.");
					}
					
				case 2 :
					this.printStudent();
					break;
				case 9 :
					this.mainMenu();
					break;
				default :
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void employeeMenu() {
		// 메뉴 번호 입력에서 2번을 입력했을 떄 실행될 코드
		int choice = 0;
		
		while(true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			
			System.out.print("메뉴 번호 : ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1 :
					this.insertEmployee();
					break;
				case 2 :
					this.printEmployee();
					break;
				case 9 :
					this.mainMenu();
					break;
				default :
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void insertStudent() {
		// 학생 메뉴에서 1번을 입력했을 때
		String name, major;
		int age, grade;
		double height, weight;
		
		while(true) {
			System.out.print("학생 이름 : ");
			name = sc.next();
			
			System.out.print("학생 나이 : ");
			age = sc.nextInt();
			
			System.out.print("학생 키 : ");
			height = sc.nextDouble();
			
			System.out.print("학생 몸무게 : ");
			weight = sc.nextDouble();
			
			System.out.print("학생 학년 : ");
			grade = sc.nextInt();
			
			System.out.print("학생 전공 : ");
			major = sc.next();
			
			int[] personCount = pc.personCount();
			if(personCount[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				return;
			}
			pc.insertStudent(name, age, height, weight, grade, major);
			System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요.");
			char ch = sc.next().charAt(0);
			if(ch == 'n' || ch == 'N') {
				return;
			}
		}
	}
	public void printStudent() {
		// 학생 메뉴에서 2번을 입력했을 때
		Student[] sArr = pc.printStudent();
		for(Student s : sArr) {
			if(s == null) {
				break;
			}
			System.out.println(s.toString());
		}
	}
	public void insertEmployee() {
		// 사원 메뉴에서 1번을 입력했을 때
		String name, dept;
		int age, salary;
		double height, weight;
		
		while(true) {
			System.out.print("사원 이름 : ");
			name = sc.next();
			
			System.out.print("사원 나이 : ");
			age = sc.nextInt();
			
			System.out.print("사원 키 : ");
			height = sc.nextDouble();
			
			System.out.print("사원 몸무게 : ");
			weight = sc.nextDouble();
			
			System.out.print("사원 급여 : ");
			salary = sc.nextInt();
			
			System.out.print("사원 부서 : ");
			dept = sc.next();
			
			int[] personCount = pc.personCount();
			if(personCount[1] == 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				return;
			}
			pc.insertEmployee(name, age, height, weight, salary, dept);
			System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요.");
			char ch = sc.next().charAt(0);
			if(ch == 'n' || ch == 'N') {
				return;
			}
		}
	}
	public void printEmployee() {
		// 사원 메뉴에서 2번을 입력했을 때
		Employee[] eArr = pc.printEmployee();
		for(Employee e : eArr) {
			if(e == null) {
				break;
			}
			System.out.println(e.toString());
		}
	}
}
