package constant.define;

/*
 * final로 상수 정의 하기
 * 최대값=9999, 최소값=1, 영어 과목 코드=1001, 수학 과목 코드=1002,
 * 원주율, GOOD_MORNING= Good Morning!!
 * 
 * 1. 최대값 출력하기
 *	  최소값 출력하기
 * 2. 영어 과목의 코드값 출력하기
 * 	  수학 과목의 코드값 출력하기
 * 3. 원주율 출력하기
 *    math 함수를 써서 원주율 출력하기
 * 4. GOOD_MORNING 출력하기
 * 
*/

public class UsingDefine {
	
	public static void main(String[] args) {

		// static이 있는 상수는 클래스 이름으로 직접 접근
		System.out.println("===========1===================");
		System.out.println("최대값은: "+ Define.MAX);
		System.out.println("최소값은: "+ Define.MIN);
		
		
		System.out.println("===========2===================");
		System.out.println("수학 과목의 코드값은: "
				+ Define.MATH);
		
		System.out.println("영어 과목의 코드값은: "
				+ Define.ENG);

		
		System.out.println("===========3===================");
		System.out.println("원주율은 " + Define.PI);
		System.out.println("원주율은 " + Math.PI);
		
		
		System.out.println("===========4===================");
		System.out.println(Define.GOOD_MORNING);
	
	
	}

}
