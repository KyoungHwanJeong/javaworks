package objectequals.hashcode_2;

/*
 * Employee의 객체 employee1의 사번: 101, 이름: 장그래 이고,
 * employee2의 사번: 101, 이름: 장그래 이다.
 * 
 * employee1과 employee2의 힙메모리 영역을 비교하여 출력하고,
 * employee1과 employee2의 equals를 재정의하고 출력하기.
 * 
 * hashcode의 값을 비교하여 동등 객체인지 출력하기.
 * hashcode를 재정의하고 출력하기.
 * 
*/
class Employee{
	private int empId;
	private String empName;
	
	Employee(int empId, String empName){
		this.empId=empId;
		this.empName=empName;
	}

	@Override
	public int hashCode() {
		return empId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee employee = (Employee)obj;
			if(this.empId== empId && this.empName== empName) {
				return true;
			}
		}	
		return false;
	}

	@Override
	public String toString() {
		return empId+ ", " + empName;
	}
		
}



public class HashCodeTest {

	public static void main(String[] args) {

		Employee employee1 = new Employee(101, "장그래");
		Employee employee2 = new Employee(101, "장그래");
		
		System.out.println(employee1 == employee2);
		System.out.println(employee1.equals(employee2));
		System.out.println("===========1==================");
		
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println("===========2==================");
		
		System.out.println(System.identityHashCode(employee1));
		System.out.println(System.identityHashCode(employee2));
	}

}
