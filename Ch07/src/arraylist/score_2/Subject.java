package arraylist.score_2;

public class Subject {

	private String subjectName;
	private int subjectScore;
	
	public Subject() {}
	
	public Subject(String subjectName, int subjectScore) {
		this.subjectName=subjectName;
		this.subjectScore=subjectScore;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName=subjectName;
	}
	
	public void setSubjectScore(int subjectScore) {
		this.subjectScore=subjectScore;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public int getSubjectScore() {
		return subjectScore;
	}
}
