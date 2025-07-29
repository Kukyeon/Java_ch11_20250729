package com.kkuk.ch11.part01;

public class Member {

	
	
	public String id; // 회원 아이디

	
	
	public Member() {
		super();
		
	}

	
	public Member(String id) {
		super();
		this.id = id;
	}

	// 객체를 인수로 받아서 그 객체가 멤버 클래스로 만든 객체인지 확인하여
	// 맞추면 true 아니면 false 를 출력하는 메소드로 오버라이딩
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)){
				return true;
			}
		}
		return false;
		
		
		
	}
	
	
	
	
	
	
	
}
