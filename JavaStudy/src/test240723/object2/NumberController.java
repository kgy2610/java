package test240723.object2;

public class NumberController {
	
	public NumberController() {
		super();
	}
	
	public boolean checkDouble(int num1, int num2) throws NumRangeException{
		if((1 <= num1 && num1 <= 100) || (1 <= num2 && num2 <= 100)) {
			return(num2 % num1 == 0);
		}else{
			throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
		}
	}
}
