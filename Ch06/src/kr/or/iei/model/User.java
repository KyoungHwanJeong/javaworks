package kr.or.iei.model;

public class User {

	private String id;
	private int pwd;
	private String name;
	
	User(){
		
	}
	
	public void setId(String id) {
		this.id=id;
	}
	public void setPwd(int pwd) {
		this.pwd=pwd;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getId() {
		return id;
	}
	public int getPwd() {
		return pwd;
	}
	public String getName() {
		return name;
	}
	public User(String id, int pwd, String name){
		this.id=id;
		this.pwd=pwd;
		this.name=name;
	}
	
	
	
	public void showUserInfo() {
		System.out.printf("아이디: %s,\t 비밀번호: %d,\t 이름: %s\n"
				, id, pwd, name);
	}
	
}
