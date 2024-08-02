package test240719.object1;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] aArr = new Animal[5];
		
		aArr[0] = new Cat("서히", "감자", "감자밭", "갈색");
		aArr[1] = new Dog("꿈이", "말티즈", 3);
		aArr[2] = new Dog("지은이", "치와와", 3);
		aArr[3] = new Cat("혜승이", "감자", "감자밭옆고구마밭", "흰색");
		aArr[4] = new Dog("공기시기질투", "진돗개", 8);
		
		for(Animal ani : aArr) {
			ani.speak();
		}
	}
}