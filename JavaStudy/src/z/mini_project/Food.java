package z.mini_project;

public class Food {
	private String fname;
	private int fprice;
	private String fkind;
	
	public Food() {
		super();
	}
	public Food(String fname, int fprice, String fkind) {
		super();
		this.fname = fname;
		this.fprice = fprice;
		this.fkind = fkind;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getFprice() {
		return fprice;
	}
	public void setFprice(int fprice) {
		this.fprice = fprice;
	}
	public String getFKind() {
		return fkind;
	}
	public void setFKind(String fkind) {
		this.fkind = fkind;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "메뉴 이름 : " + fname + ", " + fprice + "원, " + fkind;
	}
}
