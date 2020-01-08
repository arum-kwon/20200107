package co.arum.scope;

import co.arum.interfaceTest.MemberServiceImpl;
import co.arum.interfaceTest.Service;
import co.arum.interfaceTest.ServiceDelete;
import co.arum.interfaceTest.StudentServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Member member = new Member();
//		member.setId("HUB");
//		member.setPw("1122");
//		member.setName("HanUooBin");
//		member.setAddress("korea");
//		member.setTel("010-2200-7700");
//		member.setGrade(1);
//		member.toString();
//		
//		member = new Member("CNM","1234","ChanNaMu","korea","010-4455-6789",2);
//		member.insert("CNM","1234","ChanNaMu","korea","010-4455-6789",2); //매개변수 많이 안 씀, DTO로 해결
//		member.toString();
//		System.out.println(member.getId() + " " + member.getPw());
		
//		Service service = new MemberServiceImpl();
//		service.insert();
//		service.display();
		Service service1 = new StudentServiceImpl();
		service1.insert();
		service1.display();
		
//		ServiceDelete sd = new StudentServiceImpl();
//		sd.serviceDelete();
	}
}
