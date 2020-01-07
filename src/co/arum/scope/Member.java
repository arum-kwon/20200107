package co.arum.scope;

public class Member {
	private String id;
	private String pw;
	private String name;
	private String address;
	private String tel;
	private int grade;
	//C생성 R조회 U수정 D삭제 ERD(엔티티 릴레이션 다이어그램)
	
	public Member() {
	}
	public Member(String id, String pw, String name, String address, String tel, int grade) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.grade = grade;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		System.out.println("Member [id=" + id + ", pw=" + pw + ", name=" + name + ", address=" + address + ", tel=" + tel
				+ ", grade=" + grade + "]");
		return null;
	}
}
