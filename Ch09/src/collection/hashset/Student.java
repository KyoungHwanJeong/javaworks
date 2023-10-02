package collection.hashset;

public class Student {

	String name;
	int stuId;
	
	public Student(String name, int stuId) {
		this.name = name;
		this.stuId = stuId;
	}

	
	@Override
	public String toString() {
		return name + ":" + stuId;
	}
	

	@Override
	public int hashCode() {
		return name.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(name.equals(student.name)) {
				return true;
			}
		}
		
		return false;
	}

	
	
	
}
