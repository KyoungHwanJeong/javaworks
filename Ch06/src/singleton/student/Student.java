package singleton.student;

public class Student {

	private static int stuNum= 2000;
	private int stuId;
	
	public Student() {
		stuNum++;
		stuId =stuNum;
	}

	public int getstuId() {
		return stuId;
	}
}
