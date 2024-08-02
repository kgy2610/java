package test240711.object3;

import java.util.Scanner;

// 사용자와의 소통
// 입력을 받고 응답을 출력하는 것
//  -> 이 라이브러리의 목적
public class Library {
	private Scanner sc = new Scanner(System.in);
	
	int menu = 0;
	Book[] bArr = new Book[10];
	public void menu() {		
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
				case 1: // 도서 등록
					break;
				case 2 : //도서 목록 출력
					this.printBookList();
					break;
				case 3 : // 도서 검색
					this.searchBook();
					break;
				case 4: // 도서 삭제
					this.printBookList();
					this.deleteBook();
					break;
				case 9 : // 종료
					System.out.println("프로그램을 종료합니다.");
					break;
				default : // 이외 입력시
					System.out.println("");
			}
		}
	}
	
	public void addBook() {
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
	}

	public void printBookList() {
		System.out.println(" ========== 등록된 도서 목록 ==========");
		for(int i=0; i<bArr.length; i++) {
			if(bArr[i] == null) {
				break;
			}
			System.out.println(bArr[i].toString());
		}
	}

	public void searchBook() {
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
	}

	public void deleteBook() {
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
	}
}