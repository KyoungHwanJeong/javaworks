package reference.subject;

public class Student {

	// field
	int studentId;		// 학번
	String studentName;	// 이름
	
	Subject korean;		// 국어과목(참조)
	Subject math;
	
	//매개변수가 있는 생성자
	public Student(int studentId,String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
		korean = new Subject();		// korean 객체 생성
		math = new Subject();
	}
	
	// 국어 과목 추가 메서드
	public void koreanSubject(String subName, int score) {
		korean.setSubjectName(subName);
		korean.setscorePoint(score);
	}

	public void mathSubject(String subName, int score) {
		math.setSubjectName(subName);
		math.setscorePoint(score);
	}
	
	// 학생의 정보 출력
	public void showStudentInfo() {
		System.out.println(studentName + " 학생의 " + korean.getSubjectName() 
			+" 점수는 "+ korean.getscorePoint()+"점 입니다.");
		System.out.println(studentName + " 학생의 " + math.getSubjectName() 
		+" 점수는 "+ math.getscorePoint()+"점 입니다.");
	}
}
