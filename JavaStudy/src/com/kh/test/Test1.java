package com.kh.test;

import com.kh.test.Person;

public class Test1 {
	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		
		pArr[0] = new Person("김길동");
		pArr[1] = new Person("홍길동");
		pArr[2] = new Person("박길동");
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i].getName());
		}
	}
}
