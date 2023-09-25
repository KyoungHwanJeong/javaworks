package constant.define_2;

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

public class UsingDefine_2 {

	public static void main(String[] args) {

		System.out.println("===========1===================");
		System.out.println("최대값은 :" + Define_2.MAX_VALUE);
		System.out.println("최소값은 :" + Define_2.MIN_VALUE);
		
		System.out.println("===========2===================");
		System.out.println("영어 과목의 코드값은: "
					+ Define_2.ENG_CODE);
		System.out.println("수학 과목의 코드값은: "
					+ Define_2.MATH_CODE);
		
		System.out.println("===========3===================");
		System.out.println("원주율은: " + Define_2.PI);
		System.out.println("원주율은: " + Math.PI);
		
		System.out.println("===========4===================");
		System.out.println(Define_2.GOOD_MORNING);

		

		

	}

}
