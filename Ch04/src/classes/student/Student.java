package classes.student;


//참조(reference) 자료형
public class Student {

	// 클래스 내부에서는 변수를 필드라고 한다.(필드 - field)
	String studentName;		// 학생이름("홍길동")
	int studentId;			// 학번(101)
	int grade;				// 학년
	
	// 생성자
	// 기본 생성자, 없으면 compiler가 만들어준다.
	// 함수가 아니므로 반환형이 없다.
	// 클래스 이름과 같다.
	// 기본 생성자(매개 변수가 없는 생성자)는 생략 가능(컴파일러가 자동 생성함)
	public Student() {
		
	}
	
	// 학생의 정보를 출력하는 함수 method
	public void showStudentInfo() {
		System.out.println("학생이름: "+ studentName + ", 학번: " + studentId
				+ ", 학년: " +grade);
	}
	
}
