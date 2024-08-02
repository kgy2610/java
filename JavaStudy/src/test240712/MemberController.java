package test240712;

public class MemberController {
	Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	public int existMemberNum() {
		int count = 0;
		for(int i=0; i<m.length; i++) {
			if(m[i] != null) {
				count++;
			}else {
				break;
			}
		}
		return count;
	}
	
	// Inputid를 넘겨받아 사용 중 여부를 체크,
	// 중복된 id일 경우 사용 불가 -> return false
	// 중복되지 않은 ㅇid일 경우 -> return true
	public boolean checkId(String intputId) {
		for(int i=0; i<m.length; i++) {
//			String userId = m[i].getId();
//			if(userId.equals(inputId))
			if(m[i] == null) {
				return true;
			}
			if(m[i].getId().equals(intputId)) { // 아이디가 중복될 경우
				
				return false; // 사용 가능
			}
		}
		return true; // 아이디가 중복되지 않아 사용 가능
	}
	public void insertMember(String id, String name, String pw, String email, String gender, int age) {
		for(int i=0; i<m.length; i++) {
			if(m[i] == null) { // 배열 m의 i번째 값이 null -> 비어있는 부분
				m[i] = new Member(id, name, pw, email, gender.charAt(0), age);
				break;
			}
		}
	}
	public String searchId(String id) {
		return null;
	}
	public Member[] searchName(String name) {
		return null;
	}
	public Member[] searchEmail(String email) {
		return null;
	}
	public boolean updatePw(String id, String pw) {
		return false;
	}
	public boolean updateName(String id, String name) {
		return false;
	}
	public boolean updateEmail(String id, String email) {
		return false;
	}
	public boolean delete(String id) {
		return false;
	}
	public void delete() {
		
	}
	public Member[] printAll() {
		return null;
	}
}
