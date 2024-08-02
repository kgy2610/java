package test.t240709.object2;

import test.t240709.object1.Member;

public class Run {
	public static void main(String[] args) {
		Product first = new Product();
		first.ProductName("감자");
		first.ProductPrice("500");
		first.ProductBrand("동탄시장");
		
		first.information();
	}

}
