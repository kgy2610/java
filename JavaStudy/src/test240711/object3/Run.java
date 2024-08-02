package test240711.object3;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Book[] arr = new Book[3];
//		
//		arr[0] = new Book("안녕", "소설", "김철수", 50);
//		System.out.println(arr[0].toString());
		
		
		/*
		도서관에서 책을 관리하는 프로그램을 만드려고 한다.
		해당 클래스는 도서관에 책을 등록할 때 사용하는 Book 객체를 생성할 book 클래스 이다.
		필요하다고 생각하는 데이터와 기능을 구현해라
	 	*/
		
		// 사용자로부터 제목, 장르, 저자, 책번호를 입력받아
		// b1이라는 객체를 생성하고 생성된 객체외 toString메소드를 호출하여 모든 정보를 리턴받아 확인
		
		Book b1 = null, b2= null, b3 = null;
		int menu = 0;
		Book[] bArr = new Book[10];
		
		while(menu != 9) {
			System.out.println(" ========== 도서관리 프로그램 ==========");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서목록 출력");
			System.out.println("3. 도서 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
				case 1 :
					System.out.println(" ========== 도서 등록 ==========");
					System.out.print("책 제목 : ");
					String title = sc.nextLine();
					
					System.out.print("책 장르 : ");
					String kind = sc.next();
					
					System.out.print("저자 : ");
					String author = sc.next();
					
					System.out.println("책 번호 : ");
					int booknum = sc.nextInt();
					
					Book tmpBook = new Book(title, kind, author, booknum);
					
					for(int i=0; i<bArr.length; i++) {
						if(bArr[i] == null) {
							bArr[i] = new Book(title, kind, author, booknum);
							System.out.println("등록이 완료되었습니다.");
							System.out.println(tmpBook.toString());
							break;
						}else if(i == (bArr.length - 1)) { // 마지막 인덱스까지 확인한 후
							System.out.println("이미 등록할 수 있는 책이 가득 찼습니다.");
						}
					}
					

//					Book tmpBook = new Book(title, kind, author, booknum);
//					if(b1 == null) {
//						b1 = tmpBook;
//					}else if(b2 == null) {
//						b2 = tmpBook;
//					}else if(b3 == null) {
//						b3 = tmpBook;
//					}else {
//						System.out.println("이미 등록할 수 있는 책이 가득 찼습니다.");
//						break;
//					}
				case 2 :
					System.out.println(" ========== 등록된 도서 목록 ==========");
					for(int i=0; i<bArr.length; i++) {
						if(bArr[i] == null) {
							break;
						}
						System.out.println(bArr[i].toString());
					}
//					if(b1 != null) {
//						System.out.println(b1.toString());
//					}
//					if(b2 != null) {
//						System.out.println(b2.toString());
//					}
//					if(b3 != null) {
//						System.out.println(b3.toString());
//					}
					break;
					// if문을 사용하여 b1, b2, b3 따로 생성했기에 비어있는 목록 제외, 모두 출력됨
				case 3 :
					System.out.println(" ========== 도서 검색 ============");
					System.out.println("검색할 책 입력 : ");
					String search = sc.nextLine();
					
					for(int i=0; i<bArr.length; i++) {
						if(bArr[i] == null) { // null을 발견하면 뒤에 있는 데이터는 null이므로 반복 종료
							break;
						}else if(search.equals(bArr[0].getTitle())) {// 동일한 제목 발견시 출력후 본복종료
							System.out.println(bArr[i].toString());
							break;
						}
					}
//					if(b1 != null && search.equals(b1.getTitle())) {
//						System.out.println(b1.toString());
//					}else if(b2 != null && search.equals(b2.getTitle())) {
//						System.out.println(b2.toString());
//					}else if(b3 != null && search.equals(b3.getTitle())) {
//						System.out.println(b3.toString());
//					}else {
//						System.out.println("입력하신 제목의 책은 등록되어있지 않습니다.");
//					}
					// 제목 : - 장르 : - 저자 : - 책번호 : -
					// or 입력하신 제목의 책은 동록 되어있지 않습니다.
					break;
				case 4 : 
					System.out.println(" ========== 등록 도서 목록 ==========");
					for(int i=0; i<bArr.length; i++) {
						if(bArr[i] == null) {
							break;
						}
						System.out.println(bArr[i].toString());
					}
					
						System.out.println("삭제할 도서의 번호 입력 : ");
						int num = sc.nextInt();
						
						// 배열에서 해당 책 삭제
						
						for(int i=0; i<bArr.length; i++) {
							if(bArr[i] == null) {
								System.out.println("삭제할 도서의 번호를 찾지 못했습니다.");
								break;
							}else if(num == bArr[i]
									.getBooknum()) {
								System.out.println("삭제 데이터 : " + bArr[i].toString());
								// 삭제할 위치부터 마지막 위치까지 모든 값을 한 칸씩 앞으로 당김
								for(int j=i; j<bArr.length - 1; j++) {
									bArr[j] = bArr[j+1];
								}
								// 마지막 값에 null 대입
								bArr[bArr.length - 1] = null;
								break;
							}
						}
				case 9 :
					System.out.println("프로그램을 종료합니다.");
					break;
				default :
					System.out.println("잘못 입력하였습니다. 메뉴를 다시 입력해주세요.");
					continue;
			}
		}
	}
}
