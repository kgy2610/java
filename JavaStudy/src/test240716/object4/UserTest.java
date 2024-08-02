package test240716.object4;

public class UserTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		User[] users = new User[3];
		users[0] = new User("user01", "pass01", "김철수", 32, 'M', "010-1234-5678");
		users[1] = new User("user02", "pass02", "이영희", 25, 'F', "010-555-777");
		users[2] = new User("user03", "pass03", "황진이", 20, 'F', "010-9874-5632");
		
		System.out.println("user list ------------------------------------ ");
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i].toString());
		} // 반복문을 통해 배열 속 정보 출력
		
		User[] copyUsers = new User[users.length];
		for(int i=0; i<users.length; i++) {
			copyUsers[i] = (User)users[i].clone();
		}
		
		for(User copy : copyUsers) {
			System.out.println(copy.toString());
		}
		
		for(int i=0; i<copyUsers.length; i++) {
			System.out.println(copyUsers[i] == users[i]);
		}
	}
}
