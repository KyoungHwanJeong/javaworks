package classes_2.student_2;

public class StudentTest_2 {

	public static void main(String[] args) {

		/*
		 * Student 생성자를 생성하고 
		 * student1의 이름은 "홍길동", 학번은 101, 학년은 1을
		 * 입력받아서 showStudentInfo함수를 호출하여 출력
		 * 
		 * student2의 이름은 "정경환", 학번은 102, 학년은 2를
		 * 입력 받아서 print로만 출력
		 * */
		
		Student_2 student1= new Student_2();
		student1.studentName="홍길동";
		student1.studentid=101;
		student1.grade=1;
		
		student1.showStudent_2Info();
		
		Student_2 student2= new Student_2();
		student2.studentName="정경환";
		student2.studentid=102;
		student2.grade=2;
		
		System.out.print("학생이름: " + student2.studentName+ ", 학번: " + student2.studentid 
				+", 학년: " + student2.grade);
	}

}
