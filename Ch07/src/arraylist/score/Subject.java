package arraylist.score;

// Subject 자료형 정의
public class Subject {

	// 필드
	private String subjectName;	//과목이름
	private int scorePoint;
	
	public Subject() {
		
	}
	
	public Subject(String subjectName, int scorePoint) {
		this.subjectName=subjectName;
		this.scorePoint=scorePoint;
	}
	
	// getter, setter
	// 과목이름 입력
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	// 점수 입력
	public void setscorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	// 과목이름 출력
	public String getSubjectName() {
		return subjectName;
	}
	// 점수 출력
	public int getscorePoint() {
		return scorePoint;
	}
	
}
