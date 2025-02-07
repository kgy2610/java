package test240723.object1;

import java.util.Scanner;

public class CharacterController {
	Scanner sc = new Scanner(System.in);
	
	public CharacterController() {
		super();
	}
	
	public int countAlpha(String s) throws CharCheckException{
		// 매개변수로 들어온 값에 있는 영문자를 세어 반환
		// 문자열에 공백이 있다면 CharCheckException 발생, 에러 메세지는 출력 값 참고
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(s.charAt(i) == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			}else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
				count++;
			}
		}
		return count;
	}
	
}
