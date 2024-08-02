package z.mini_project;

public class JpFood extends Food{
	private boolean coupon;

	public JpFood() {
		super();
	}
	public JpFood(String fname, int fprice, String fkind, boolean coupon) {
		super(fname, fprice, fkind);
		this.coupon = coupon;
	}
	
	public boolean isCoupon() {
		return coupon;
	}
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	
	@Override
	public String toString() {
		return "[" + super.toString() + "]";
	}
}
