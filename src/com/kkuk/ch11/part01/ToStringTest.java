package com.kkuk.ch11.part01;

import java.util.Date;

public class ToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Object ob = new Object();
		System.out.println(ob.toString());
		
		
		Member member = new Member();
		System.out.println(member.toString());
		
		Date date = new Date();
		System.out.println(date.toString());
	}

}
