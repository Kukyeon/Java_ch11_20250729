package com.kkuk.ch11.part01.stringtest;

public class SubStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String addr = "서울특별시 종로구 송인동 111번지 304호 2층";
		
		String firstaddr = addr.substring(6, 9);
		System.out.println(firstaddr);
		// 인덱스값으로 추출되는 문자열을 짤라줌
		//endindex에 해당하는 문자는 문자열에 포함이 안됨;
		
		String secondaddr = addr.substring(14);
		System.out.println(secondaddr);
		// 값 자리에 인덱스값 한개만 넣으면 시작 인덱스 부터 뒤까지 다 출력 / endindex 생략시
		
		
		
		
		
		
		
	}

}
