package objectarray_2.dogs_2;

public class Dog_2 {

	private String dogName;
	private String dogType;
	
	public Dog_2() {
		
	}
	public Dog_2(String dogName, String dogType) {
		this.dogName=dogName;
		this.dogType=dogType;
	}
	public String getDogName() {
		return dogName;
	}
	public String getDogType() {
		return dogType;
	}

	public void showDog_2Info() {
		System.out.println(dogName + ", " +dogType);
	}
	public String showDog_2Info2() {
		return dogName + ", " + dogType;
	}
}
