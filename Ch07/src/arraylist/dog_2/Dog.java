package arraylist.dog_2;

public class Dog {

	private String dogName;
	private String dogType;
	
	public Dog(String dogName, String dogType) {
		this.dogName=dogName;
		this.dogType=dogType;
	}

	@Override
	public String toString() {
		return dogName + ", " + dogType;
	}
	
	
}
