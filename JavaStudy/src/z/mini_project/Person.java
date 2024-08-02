package z.mini_project;

public class Person {
	private String name;
	private int age;
	private String address;
	private int phoneNum;
	private int CHcouponCount = 0;
	private int JPcouponCount = 0;
	private int KOcouponCount = 0;
	
	public Person() {
		super();
	}
	public Person(String name, int age, String address, int phoneNum) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getCHcouponCount() {
		return CHcouponCount;
	}
	public void setCHcouponCount(int cHcouponCount) {
		CHcouponCount = cHcouponCount;
	}
	public int getJPcouponCount() {
		return JPcouponCount;
	}
	public void setJPcouponCount(int jPcouponCount) {
		JPcouponCount = jPcouponCount;
	}
	public int getKOcouponCount() {
		return KOcouponCount;
	}
	public void setKOcouponCount(int kOcouponCount) {
		KOcouponCount = kOcouponCount;
	}
	@Override
	public String toString() {
		return name + "님, 나이 : " + age + "세, 사는 지역 : " + address + ", 휴대폰 번호 : " + phoneNum +
				"\n중식 쿠폰 갯수 : " + CHcouponCount + "\n일식 쿠폰 갯수 : " + JPcouponCount + "\n한식 쿠폰 갯수 : " + KOcouponCount;
	}
}
