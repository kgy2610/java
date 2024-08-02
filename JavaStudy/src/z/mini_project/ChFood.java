package z.mini_project;

public class ChFood extends Food{
	private boolean coupon;

	public ChFood() {
		super();
	}
	public ChFood(String fname, int fprice, String fkind, boolean coupon) {
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
