package com.kh.test;

public class Food {
	private String name;
	private int kcal;
	
	public Food() {
		super();
	}
	public Food(String name, int kcal) {
		super();
		this.name = name;
		this.kcal = kcal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "음식 [이름 : " + name + ", 칼로리 : " + kcal + "]";
	}
}
