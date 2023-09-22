package arraylist.score_2;

import java.util.ArrayList;

public class Student {

	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList=new ArrayList<>(); 
	
	//학생의 정보
	public Student(int studentId, String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
	}
	
	//과목 입력
	public void addSubject(String subjectName, int subjectScore) {
		Subject subject = new Subject(subjectName, subjectScore);
		subjectList.add(subject);
	}
	
	//학생의 정보
	public void showStudentInfo() {
		int total=0;
		double average;
		for(int i=0;i<subjectList.size();i++) {
			Subject sub =subjectList.get(i);
			total+=sub.getSubjectScore();
			
			System.out.printf("학생 %s의 %s과목 점수는 %d점 입니다.\n"
					, studentName, sub.getSubjectName()
					, sub.getSubjectScore());
		}
		average=(double)total/subjectList.size();
		System.out.printf("학생 %s의 총점은 %d점 이고, 평균은 %.2f점 입니다."
				, studentName, total, average);
		
		
	}
}
