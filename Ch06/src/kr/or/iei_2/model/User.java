package kr.or.iei_2.model;

public class User {

	private String id;
	private int pwd;
	private String name;
	
	public User(){
		
	}
	
	public User(String id, int pwd, String name){
		this.id=id;
		this.pwd=pwd;
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
	
	
}
