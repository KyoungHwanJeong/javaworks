package reference_2.subject2_2;

public class Student2_2 {

	private int studentId;
	private String studentName;
	private Subject2_2[] subjects;
	
	public Student2_2(int studentId, String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
		subjects= new Subject2_2[10];
	}
	
	public void addSubject(String name,int score) {
		Subject2_2 subject = new Subject2_2();
		subject.setSubjectName(name);
		subject.setSubjectScore(score);
		
		for(int i=0;i<subjects.length;i++) {
			if(subjects[i]==null) {
				subjects[i]=subject;
				break;
			}
		}
	}
	
	public void showStudent2_2Info() {
		int total=0;
		double average=0.0;
		int count=0;
		
		for(int i=0;i<subjects.length;i++) {
			if(subjects[i]!=null) {
				total +=subjects[i].getSubjectScore();
				count++;
		
				System.out.println(studentId + "번 학생 "
						+ studentName +"의 "+subjects[i].getSubjectName()
						+ "점수는 " + subjects[i].getSubjectScore()
						+ "점 입니다.");
				
			}
		}
		average=(double)total/count;
		
		System.out.printf("과목의 총점은: %d점이고, 평균은 %.1f 점입니다.\n"
				,total,average);
	}
}
