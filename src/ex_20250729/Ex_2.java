package ex_20250729;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. korea@korea.com 이메일 주소에서 아이디와 도메인을 분리하여 출력하는 프로그램을 작성하시오.
		String add = "korea@korea.com";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이메일을 입력하세요");
		String str = scanner.nextLine();
		
		String id = str.substring(0, 5);
		
		
		System.out.println(str + "에서" );
		System.out.println("아이디는 : " + id );
		System.out.println("도메인은 : " + str.substring(6));
		
		scanner.close();	
		
		System.out.println("------------------------");
		
//		String email = "korea@korea.com";
//		
//		String emailName = email.substring(0, 5);
//		String emailDomain = email.substring(6);
//		
//		System.out.println("아이디는 : " + emailName );
//		System.out.println("도메인은 : " + emailDomain);
		
		
		System.out.println("------------------------");
		
//		String email = "korea@korea.com";
//		
//		int at_index = email.indexOf("@"); // @의 인덱스
//		String emailName = email.substring(0, at_index);
//		String emailDomain = email.substring(at_index + 1);
//		
//		System.out.println("아이디는 : " + emailName );
//		System.out.println("도메인은 : " + emailDomain);
		
		
		
	}

}
