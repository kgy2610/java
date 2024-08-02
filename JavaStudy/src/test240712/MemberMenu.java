package test240712;

import java.util.Scanner;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		int choice = 0;
		
		while(choice != 9) {
			System.out.println("최대 등록 가능한 회원 수는" + MemberController.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원 수는" + mc.existMemberNum() + "명입니다.");
			//현재 등록된 회원 수에 따라 메인 메뉴를 다르게 출력
			// 현재 등록된 회원 수가 10명이 아닐 때
			if(mc.existMemberNum() != 10) {
				System.out.println("1. 새 회원 등록"); // -> insertMember()
			}else {
				//현재 등록된 회원 수가 10명일 때
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈 됩니다.");
			}
			System.out.println("2. 회원 검색"); // -> searchMember()
			System.out.println("3. 회원 정보 수정"); // -> updateMember()
			System.out.println("4. 회원 삭제"); // -> deleteMember()
			System.out.println("5. 모두 출력"); // -> print()
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				this.insertMember();
				break;
			case 2 :
			case 3 :
				this.updateMember();
			case 4 :
			case 5 :
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				break;
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	public void insertMember() {
		String id, pw, name, email, gender;
		int age;
		
		System.out.println("새 회원을 등록합니다.");
		
		while(true) {
			System.out.print("아이디 : ");
			id = sc.next();
			if(mc.checkId(id)) { // 사용 가능
				break;
			} else { // 사용 불가
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
				}
			}
		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("비밀번호 : ");
		pw = sc.next();
		System.out.print("이메일 : ");
		email = sc.next();
		while(true) {
			System.out.print("성별(M/F) : ");
			gender = sc.next();
			if(gender.equals("m") || gender.equals("M") || gender.equals("f") || gender.equals("F")) {
				break;
			}else { // 사용 불가
				System.out.print("성별을 다시 입력해주세요.");
				}
		}
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		mc.insertMember(id, name, pw, email, gender, age);
	}
	public void searchMember() {
		
	}
	public void searchId() {
		
	}
	public void searchName() {
		
	}
	public void searchEmail() {
		
	}
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		
		System.out.print("메뉴 번호 : ");
		
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1 :
//			updatePassword
		case 2 :
//			updateName
		case 3 :
//			updateEmail
		case 9 :
			System.out.println("메인으로 돌아갑니다.");
		default :
		}
	}
	public void updatePassword() {
		
	}
	public void updateName() {
		
	}
	public void updateEmail() {
		
	}
	public void deleteMember() {
		
	}
	public void deleteOne() {
		
	}
	public void deleteAll() {
		
	}
	public void printAll() {
		
	}
}