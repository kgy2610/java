package z.mini_project;

import java.util.Scanner;

public class FoodMenu {
	FoodController fc;
	Scanner sc;
	private Person currentUser;
	
	public FoodMenu() {
		super();
		this.fc = new FoodController();
		this.sc = new Scanner(System.in);
	}
	public void main(String[] args) {
		FoodMenu foodMenu = new FoodMenu();
		foodMenu.userInfo();
		foodMenu.mainMenu();
	}
	
	public void userInfo() {
		String name;
		int age;
		String address;
		int phoneNum;
		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("사는지역 : ");
		address = sc.next();
		System.out.print("전화번호 : ");
		phoneNum = sc.nextInt();
		
		currentUser = new Person(name, age, address, phoneNum);
		
		fc.insertPerson(currentUser);
	}
	public void mainMenu() {
		int choice = 0;
		
		if(currentUser == null) {
			userInfo();
		}
		
		boolean isAdmin = currentUser.getName().equals("관리자") && currentUser.getAge() == 1 && currentUser.getAddress().equals("집") && currentUser.getPhoneNum() == 1;
		
		while(choice != 9) {
			System.out.println(" ******** 메뉴 ******** ");
			System.out.println("1. 사용자 메뉴");
			if(isAdmin) {
				System.out.println("2. 관리자 메뉴");
			}
			System.out.println("8. 로그아웃");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴 선택 : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				this.userMenu();
				break;
			case 2 :
				this.managerMenu();
				break;
			case 8 : 
				this.userInfo();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return; // 종료
			default : 
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void userMenu() {
		int choice = 0;
		
		while(true) {
			System.out.println(" ******** 사용자 메뉴 ******** ");
			System.out.println("1. 음식 주문하기");
			System.out.println("2. 전체 음식 조회");
			System.out.println("3. 음식 검색하기");
			System.out.println("4. 마이페이지");
			System.out.println("9. 메뉴로 돌아가기");
			
			System.out.print("메뉴 번호 : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				this.buyFood();
				break;
			case 2 :
				this.selectAll();
				break;
			case 3 : 
				this.searchFood();
				break;
			case 4 :
				Person p = fc.myInfo();
				System.out.println(p);
				break;
			case 9 :
				this.mainMenu();
				break;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void buyFood() {
		// 사용자메뉴에서 [1. 음식 주문하기]를 선택했을 때
		this.selectAll();
		
		System.out.print("구매할 메뉴 번호 선택 : ");
		int index = sc.nextInt();
		int result = fc.buyFood(index);
		switch(result) {
		case 1 : 
			System.out.println("중식을 선택하셨습니다. 중식 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
			break;
		case 2 : 
			System.out.println("일식을 선택하셨습니다. 일식 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
			break;
		case 3 : 
			System.out.println("한식을 선택하셨습니다. 한식 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
			break;
		}
	}
	
	public void selectAll() {
		// 사용자메뉴에서 [2. 전체음식조회]를 선택했을 때
		Food[] fList = fc.selectAll();
		for(int i=0; i<fList.length; i++) {
			System.out.println(i + "번 메뉴 : " + fList[i].toString());
		}
	}
	
	public void searchFood() {
		// 사용자메뉴에서 [3. 음식 검색하기]를 선택했을 때
		System.out.print("검색할 메뉴 키워드(ex | 한식, 중식, 일식 또는 메뉴이름) : ");
		String word = sc.next();
		Food[] foodList = fc.searchFood(word);
		
		this.printFoodList(foodList);
	}
	
	public void printFoodList(Food[] fList) {
		for(int i=0; i<fList.length; i++) {
			if(fList[i] == null) {
				break;
			}
			System.out.println(i + "번 메뉴 : " + fList[i].toString());
		}
	}
	
	public void managerMenu() {
		int choice = 0;
		
		while(true) {
			System.out.println(" ******** 관리자 메뉴 ******** ");
			System.out.println("1. 음식 등록하기");
			System.out.println("2. 등록된 음식 삭제하기");
			System.out.println("9. 메뉴로 돌아가기");
			
			System.out.print("메뉴 번호 : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				this.insertFood();
				break;
			case 2 :
				this.deleteFood();
				break;
			case 9 :
				this.mainMenu();
			}
		}
	}
	
	public void insertFood() {
		// 관리자 메뉴에서 [1. 음식 등록하기]를 입력했을 때
		String fname, fkind;
		int fprice;
		
		while(true) {
			System.out.print("메뉴 이름 : ");
			fname = sc.next();
			
			System.out.print("메뉴 가격 : ");
			fprice = sc.nextInt();
			
			System.out.print("메뉴 종류(한식, 중식, 일식) : ");
			fkind = sc.next();
		}
		
	}
	public void deleteFood() {
		// 관리자 메뉴에서 [2. 등록된 음식 삭제하기]를 입력했을 때
		
	}
}
