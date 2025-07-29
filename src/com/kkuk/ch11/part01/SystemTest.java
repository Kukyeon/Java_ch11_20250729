package com.kkuk.ch11.part01;

public class SystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0 ; i < 10000 ; i ++) {
			System.out.println(i);
			if(i == 5000) {
				//System.exit(i); // 프로그램이 종료됨
				break;
			}
		}
		
			System.out.println("for문이 끝난 후 출력되는 문장");
			
			long time1 = System.nanoTime(); // 현 시간 나노초로 반환하여 저장
			long time_m1 = System.currentTimeMillis(); // 밀리 초 
			System.out.println("----------------------------------");
			
		
			long sum = 0L;
			for(int i = 1 ; i <= 1000000 ; i++) {
				sum +=i;
			}
			System.out.println(sum);
			
			
			System.out.println("----------------------------------");
			
			long time2 = System.nanoTime(); // 현 시간을 나노초로 반환하여 저장
			long time_m2 = System.currentTimeMillis(); // 밀리 초 
			
			System.out.println(time2 - time1); // 사이 출력문이 진행되는 시간 /나노초
			System.out.println(time_m2 - time_m1); // 밀리초
	}
	

}
