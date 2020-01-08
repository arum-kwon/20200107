package co.arum.interfaceTest;

import java.util.ArrayList;
import java.util.Scanner;

import co.arum.scope.Member;
import co.arum.scope.Student;

public class StudentServiceImpl implements Service,ServiceDelete {

	private ArrayList<Student> list;
	@Override
	public void insert() {
		Student student;
		list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		boolean b = true;
		do {
			System.out.println("학생 추가 y/n");
			String input = sc.nextLine();
			if(input.equals("n") || input.equals("N")) {
				break;
			}
			student = new Student();
			System.out.print("아이디 : ");
			student.setId(sc.nextLine());
			System.out.print("이름 : ");
			student.setName(sc.nextLine());
			System.out.print("전화 : ");
			student.setTel(sc.nextLine());
			System.out.print("전공 : ");
			student.setMajor(sc.nextLine());
			
			list.add(student);
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
		for(Student s : list) {
			s.toString();
		}
	}
	
	@Override
	public void serviceDelete() {
		System.out.println("serviceDelete");
	}
	
	public void studentDisplay() {
		// TODO Auto-generated method stub
		System.out.println("studentDisplay");
	}
}
