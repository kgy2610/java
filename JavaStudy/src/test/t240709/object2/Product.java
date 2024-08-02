package test.t240709.object2;

public class Product {
	// ========== 필드 영역 ==========
	private String pName;
	private String price;
	private String brand;
	
	// ========== 생성자 영역 ==========
	public Product() {}
	
	public Product(String name, String price, String brand) {
		this.pName = name;
		this.price = price;
		this.brand = brand;
	}
	
	// ========== 메소드 영역 ==========
	public void ProductName(String name) {
		this.pName = name;
	}
	public void ProductPrice(String price) {
		this.price = price;
	}
	public void ProductBrand(String brand) {
		this.brand = brand;
	}
	
	public void information() {
		System.out.println("상품명 : " + this.pName + "\n상품 가격 : " + this.price + "원" + "\n브랜드명 : " + this.brand);
	}
}
