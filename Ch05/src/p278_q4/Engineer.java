package p278_q4;

public class Engineer extends Employee {


	private String skillset;
	public String getSkillSet() {
		return skillset;
	}
	public void setSkillSet(String skillset) {
	this.skillset=skillset;
	}
	/*
	 * 오류 원인 - Employee 의 생성자를 상속받지 않음
	 * 결함 조치 - super()를 사용하여 생성자를 상속 받음
	 */
	public Engineer(String name) {	// 생성자 에러
		super(name);		// name을 사용하지 않더라도 
							// Employee 클래스의 생성자를 상속
							// 받아야 한다.

	}
	
}
