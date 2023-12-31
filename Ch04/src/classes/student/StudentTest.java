package classes.student;

public class StudentTest {

	public static void main(String[] args) {
		
		
		/*
		 * Student 생성자를 생성하고 
		 * student1의 이름은 "홍길동", 학번은 101, 학년은 1을
		 * 입력받아서 showStudentInfo함수를 호출하여 출력
		 * 
		 * student2의 이름은 "정경환", 학번은 102, 학년은 2를
		 * 입력 받아서 print로만 출력
		 * */
		
		// Student 객체(변수)를 생성
		// 메모리영역(new를 하면 heap 영역을 사용)
		// 객체 접근 방법: 점 연산자로 접근한다.
		
		// Student 클래스, student1 객체
		Student student1 = new Student();
		student1.studentName ="홍길동";
		student1.studentId= 101;
		student1.grade=1;
		
/*		System.out.println("학생이름: " + student1.studentName);
		System.out.println("학번: " + student1.studentId);
		System.out.println("학년: " + student1.grade);		
*/
		student1.showStudentInfo();
		
		System.out.println("========================");
		
		Student student2 = new Student();
		student2.studentName= "정경환";
		student2.studentId= 102;
		student2.grade= 2;
/*		System.out.println("학생이름: " + student2.studentName);
		System.out.println("학번: " + student2.studentId);
		System.out.println("학년: " + student2.grade);
*/
		student2.showStudentInfo();

	}

}
