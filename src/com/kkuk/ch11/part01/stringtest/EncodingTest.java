package com.kkuk.ch11.part01.stringtest;

import java.io.UnsupportedEncodingException;

public class EncodingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "안녕하세요오!";
		
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1);
		System.out.println(bytes1.length); //배열 요소의 길이
		
		
		String str2 = new String(bytes1);
		System.out.println(str2);
		
		
		try { // 인코딩을 하게되면 에러가 날 확률이 있기에 트라이캐치로 묶어
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println(bytes2.length);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println(bytes3.length);
			
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
