package com.kh.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class File {
	public void fileSave(String fileName) {
		// 전달 받은 fileName을 사용하여 File 객체 생성
		File file = new File(fileName);
		
		// 파일 객체와 연결하는 파일 출력 스트림 생성
		try {
			FileOutputStream fs = new FileOutputStream(file);
			// 파일에 Food객체를 기록할 수 있는 객체 출력 스트림 추가
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			// 파일에 Food 객체 정보를 기록
			Food food = new Food("사과", 10);
			os.writeObject(food);
			fs.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		FoodSave save = new FoodSave();
	}
}
