package com.kkuk.ch11.part01;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Member member1 = new Member("tiger");
		Member member2 = new Member("tiger");
		Member member3 = new Member("monkey");
		Member member4 = new Member("dog");


		if(member1.equals(member2)) {
			System.out.println("두 멤버의 아이디는 동일합니다. ");
		} else {
			System.out.println("두 멤버의 아이디는 동일하지 않습니다.");
		}
		
		
		if(member1.equals(member4)) {
			System.out.println("두 멤버의 아이디는 동일합니다. ");
		} else {
			System.out.println("두 멤버의 아이디는 동일하지 않습니다.");
		}
		System.out.println("==========================================");
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		System.out.println(member3.hashCode());
		System.out.println(member4.hashCode());
	}

}
