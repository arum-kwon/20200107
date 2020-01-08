package co.arum.interfaceTest;

import java.util.ArrayList;
import java.util.Scanner;

import co.arum.scope.Member;

public class MemberServiceImpl implements Service {
	private ArrayList<Member> list;

	@Override
	public void insert() {
		list = new ArrayList<Member>();
		
		Scanner sc = new Scanner(System.in);
		
		boolean b = true;
		do {
			System.out.println("멤버 추가 y/n");
			String input = sc.nextLine();
			if(input.equals("n") || input.equals("N")) {
				break;
			}
			Member member = new Member();
			System.out.print("아이디 : ");
			member.setId(sc.nextLine());
			System.out.print("비밀번호 : ");
			member.setPw(sc.nextLine());
			System.out.print("이름 : ");
			member.setName(sc.nextLine());
			System.out.print("주소 : ");
			member.setAddress(sc.nextLine());
			System.out.print("전화 : ");
			member.setTel(sc.nextLine());
			System.out.print("등급 : ");
			member.setGrade(sc.nextInt());
			sc.nextLine();
			
			list.add(member);
		}while(b);
		sc.close();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for(Member m : list) {
			m.toString();			
		}
	}

}
