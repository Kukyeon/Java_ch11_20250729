package com.kkuk.ch11.part01.stringtest;

public class StringTest0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "kor";
		String str2 = "jap";
		String str3 = str1 + str2;
		System.out.println(str3);
		
		
		//banana
		String str4 = "";
		if(str4.indexOf("b") == -1) {
			str4 = str4 + "b";
		} else if(str4.indexOf("n") == -1) {
			str4 = str4 + "n";
		} else if(str4.indexOf("a") == -1) {
			str4 = str4 + "a";
		}
			
		}
		
	}


