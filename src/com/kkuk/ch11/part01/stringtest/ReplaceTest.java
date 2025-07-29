package com.kkuk.ch11.part01.stringtest;

public class ReplaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "길동이는 순신이보다 키가 큽니다. 하지만 순신이가 길동이보다 말을 잘합니다."; // 길동을 유신으로 바꾸는 / 순서를 바꾸는
		String repString = str.replace("길동", "유신"); //원본을 수정 시키지는 않음; 
		System.out.println(str); // 새로운 변수로 저장하여 출력해야함
		System.out.println(repString);
		
	}

}
