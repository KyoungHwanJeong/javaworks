package statics.student;

public class Student {

	int id;							// 인스턴스 변수(필드)
	static int serialNum = 1000;	// 클래스 변수(필드)
	String name;					// 인스턴스 변수(필드)
	
/*	
	public Student() {
		serialNum++;
		id =serialNum;
	}
*/
	
	// 입력
	public int getId() {
		return id;
	}
	// 출력
	public void setId(int id) {
		this.id=id;
	}
}
