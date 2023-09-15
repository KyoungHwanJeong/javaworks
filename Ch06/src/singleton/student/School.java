package singleton.student;

public class School {
	
	private static School instance;
	
	School(){
		
	}
	
	public static School getinstance(){
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}
	
	public Student newStudent() {
		Student student = new Student();
		return student;
	}

}
