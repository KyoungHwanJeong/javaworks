package kr.or.iei_2.model;

public class User {

	private String id;
	private String pwd;
	private String name;
	

	public User() {
		
	}
	public void setId(String id) {
		this.id=id;
	}
	public void setPwd(String pwd) {
		this.pwd=pwd;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getName() {
		return name;
	}
	public User(String id, String pwd, String name) {
		this.id=id;
		this.pwd=pwd;
		this.name=name;
	}
	
}
