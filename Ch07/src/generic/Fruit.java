package generic;

public class Fruit {

	String name;	// 과일 이름
	
	public Fruit(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
