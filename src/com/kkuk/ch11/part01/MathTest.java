package com.kkuk.ch11.part01;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Math.abs(-10); // 절대값 계산 -> 10 됨
		System.out.println(Math.abs(-10));
		
		Math.ceil(3.14); // 소숫점 올림 반올림x 그냥 소숫점 뒤에 다올려버림
		System.out.println(Math.ceil(3.14));
		
		Math.floor(3.94); // 소숫점 내림 반래임x 그냥 소숫점 뒤에 다 내려버림
		System.out.println(Math.floor(3.94));
		
		Math.round(3.64); // 소숫점 반올림 , 소숫점 몇번째부터 올릴건지 선택도 가능
		System.out.println(Math.round(3.64));
		
		Math.max(5, 10); //  // 두개의 값 중에서 더 큰값이 리턴된다
		System.out.println(Math.max(5, 10));
		
		Math.min(5, 10); //  // 두개의 값 중에서 더 작은값이 리턴된다
		System.out.println(Math.min(5, 10));
		
		Math.random(); // 0 ~ 1 사이의 수 중에서 랜덤으로 1 개 반환 (0 은 가능 1 은 불가능)
		System.out.println(Math.random());
		
		System.out.println(Math.floor(Math.random() * 45 + 1)); // 1부터 45사이의 수 중 랜덤으로 1개 반환, 소수점 내림
		
		System.out.println(Math.rint(3.4)); //자동 반올림,반내림 , 인수값에 가장 가까운 정수를 실수형으로 반환
	}

}
