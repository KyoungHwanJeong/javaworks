package kr.or_2.iei_2.model_2;

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
