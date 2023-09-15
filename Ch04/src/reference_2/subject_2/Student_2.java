package reference_2.subject_2;

public class Student_2 {

	private String studentName;
	private int studentId;
	
	Subject_2 korean;
	Subject_2 math;
	
	Student_2(){
		
	}
	Student_2(String studentName, int studentId){
		this.studentName=studentName;
		this.studentId=studentId;
	}
	
	public void koreanSubject(String subName, int subScore) {
		korean= new Subject_2();
		korean.setSubName(subName);
		korean.setSubScore(subScore);
	}
	
	public void mathSubject(String subName, int subScore) {
		math= new Subject_2();
		math.setSubName(subName);
		math.setSubScore(subScore);
	}
	
	public void showStudent_2Info() {
		System.out.println(studentName +" 학생의 "
				+ korean.getSubName() + " 점수는 "
				+korean.getSubScore() +"점 입니다.");
		System.out.println(studentName +" 학생의 "
				+ math.getSubName() + " 점수는 "
				+math.getSubScore() +"점 입니다.");
	}
}
