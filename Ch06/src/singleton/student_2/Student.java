package singleton.student_2;

public class Student {

	private static int studentNum=2000;
	private int studentId;
	
	public Student() {
		studentNum++;
		studentId= studentNum;
	}
	
	public int getStudentId() {
		return studentId;
	}
}
