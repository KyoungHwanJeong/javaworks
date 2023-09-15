package objectarray.dogs;

public class Dog {

	// 필드
	private String name;
	private String type;
	
	// 생성자
	public Dog(String name,String type) {
		this.name=name;
		this.type=type;
	}
	
	// get() 함수
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}

	// 개의 정보 출력
	public void showDogInfo() {
		System.out.println(name + ", " + type);
	}
	public String showDogInfo2() {
		return name +", "+ type;
	}
}
