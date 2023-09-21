package objectequals;

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
*/

class Employee{
	// 필드 - 멤버 변수, 인스턴스 변수
	int empId;			// 사번
	String empName;
	
	Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}

	// equals 메서드 재정의
	@Override
	public boolean equals(Object obj) { 
							// Employee < obj (자료 크기)이므로
							// 논리적으로 문자열이 동일하도록 구현
		if(obj instanceof Employee) {
								// obj가 Employee의 인스턴스라면
								// 다운 캐스팅(강제 형변환)
			Employee employee = (Employee)obj;
			if(this.empId == employee.empId)
						// 외부에서 입력한 사번과 원래 사번이일치한다면
				return true;
		}
		return false;
	}

	
	@Override
	public int hashCode() {	// int형인 empId를 반환함
		return empId;		// 문자로 받으면 .hashCode() 변환한다.
	}		
	
}

public class HashCodeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "장그래");
		Employee emp2 = new Employee(101, "장그래");
		
		System.out.println(emp1 == emp2);	// false 힙 메모리.
		System.out.println(emp1.equals(emp2));
							// equals를 재정의 하면 true가 된다.
		
		
		// hashCode값 비교 - 동등 객체인지 확인(문자열의 일치 확인)
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		// 실제 물리 주소 비교 - 해시코드를 재정의 했기 때문에 같다.
		System.out.println(System.identityHashCode(emp1));
		System.out.println(System.identityHashCode(emp2));
	
	}

}
