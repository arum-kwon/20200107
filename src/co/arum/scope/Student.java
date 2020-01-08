package co.arum.scope;

public class Student { //변수와 get set만 되어있는것 DTO
	private String id;
	private String name;
	private String major;
	private String tel;
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public String getTel() {
		return tel;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		System.out.println("Student [id=" + id + ", name=" + name + ", majorl=" + major + ", tel=" + tel + "]");
		return null;
	}
	
	
}
