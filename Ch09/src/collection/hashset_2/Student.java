package collection.hashset_2;

public class Student {

	private String name;
	private int stuId;
	
	public Student(String name, int stuId) {
		this.name=name;
		this.stuId=stuId;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student=(Student)obj;
			if(name.equals(student.name)) {
				return true;
			}
				
		}
		return false;
	}

	@Override
	public String toString() {
		return name + ":" + stuId;
	}
	
	
	
}
