package inheritance.person;

// Engineer가 Person을 상속 받음
public class Engineer extends Person{


	int companyId;	
	
	// 매개변수가 있는 생성자를 상속 받았을 때 super()사용
	public Engineer(String name, int age, int companyId) {
		super(name, age);			// 부모 클래스 상속
		this.companyId=companyId;	// 자식 클래스의 필드 초기화
	}
	
	public int getCompanyid() {
		return companyId;
	}
}
