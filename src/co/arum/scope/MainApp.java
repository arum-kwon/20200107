package co.arum.scope;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member();
		member.setId("HUB");
		member.setPw("1122");
		member.setName("HanUooBin");
		member.setAddress("korea");
		member.setTel("010-2200-7700");
		member.setGrade(1);
		member.toString();
		
		member = new Member("CNM","1234","ChanNaMu","korea","010-4455-6789",2);
		member.toString();
	}
}
