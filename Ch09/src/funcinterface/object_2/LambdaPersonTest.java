/*
 * 추상 메서드와 람다식 활용하기.
 * Workable 인터페이스
 * Person
 * 1. work() 메서드를 실행.
 * Main
 * 1. 	"출근을 합니다."
 * 		"프로그래밍을 합니다."
 * 		"퇴근을 합니다."
 * 가 출력 되도록 람다식으로 구현하기.
 * 
*/

package funcinterface.object_2;

public class LambdaPersonTest {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.action(() -> {System.out.println("출근을 합니다.");});
		person1.action(() -> System.out.println("프로그래밍을 합니다."));

		person1.action(() -> System.out.println("퇴근을 합니다."));

	}

}
