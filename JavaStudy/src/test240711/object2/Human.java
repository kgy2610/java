package test240711.object2;

public class Human {
	private String name;
	private int money;
	
	public Human(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void buy(TV tv) {
		if(tv.getPrice() <= this.money) { // tv의 가격보다 소유한 돈이 많을 경우 구매가능 
			System.out.println(this.name + "님 구매 내역");
			tv.show();
			this.money -= tv.getPrice();
			System.out.println("남은 잔액 : " + this.money);
		}else { // tv의 가격보다 소유한 돈이 적을 경우 구매불가능
			System.out.println(this.name +"님 잔액이 부족하여 구매하실 수 없습니다.");
		}
	}
}
