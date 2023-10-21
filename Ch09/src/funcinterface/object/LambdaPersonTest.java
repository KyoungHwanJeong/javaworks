/*
 * 추상 메서드와 람다식 활용하기.
 * Workable 인터페이스
 * Person
 * Main
 * 1. 	"출근을 합니다."
 * 		"프로그래밍을 합니다."
 * 		"퇴근을 합니다."
 * 가 출력 되도록 람다식으로 구현하기.
 * 
*/

package funcinterface.object;

public class LambdaPersonTest {

	public static void main(String[] args) {

		//Person 객체 생성
		Person person = new Person();
		
		// 추상메서드 구현 -> 람다식(익명 메서드)
		person.action(() -> {
			System.out.println("출근을 합니다.");
			System.out.println("프로그래밍을 합니다.");
		});
		
		person.action(() -> {
			System.out.println("퇴근을 합니다.");	
		});
	}

}
