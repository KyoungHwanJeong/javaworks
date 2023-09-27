package constant;

public class UsingDefine {

	/*
	 * 상수 정의 하기
	 * 
	 * 
	*/
	
	
	
	public static void main(String[] args) {

		// static이 있는 상수는 클래스 이름으로 직접 접근
		System.out.println("최대값은: "+ Define.MAX);
		System.out.println("최소값은: "+ Define.MIN);
		
		System.out.println("수학 과목의 코드값은: "
				+ Define.MATH);
		
		System.out.println("영어 과목의 코드값은: "
				+ Define.ENG);

		System.out.println("원주율은 " + Define.PI);
		System.out.println("원주율은 " + Math.PI);
		
		System.out.println(Define.GOOD_MORNING);
	
	
	}

}
