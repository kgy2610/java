package test.t240704;

import java.util.Scanner;

public class T_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 사용자에게 관리자, 회원, 비회원 중 하나를 입력받아 각 등급이 행할 수 있는 권한을 출력
		 * 단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성 가능
		 * 회원은 게시글 작성, 게시글 조회, 댓글 작성 가능
		 * 비회원은 게시글 조회만 가능
		 * 
		 * ex)
		 * 권한을 확인하고자 하는 회원 등급 : 관리자
		 * 회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회
		 */
		
		String manager = "관리자";
		String member = "회원";
		String Nmember = "비회원";
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String user = sc.next();
		
//		if(user.equals(manager)) {
//			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
//		}else if(user.equals(member)){
//			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
//		}else if(user.equals(Nmember)) {
//			System.out.println("게시글 조회");
//		}else {
//			System.out.println("존재하지 않는 권한입니다.");
//		}
		
		switch(user) {
			case "관리자" : 
				System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
				break;
			case "회원" :
				System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
				break;
			case "비회원" : 
				System.out.println("게시글 조회");
				break;
			default :
				System.out.println("존재하지 않는 권한입니다.");
				return;
		}
	}
}
