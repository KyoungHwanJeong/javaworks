package funcinterface.object;

public class Person {

	void action(Workable workable) {
		workable.work();		// Workable 인터페이스의 work() 함수에 접근한다.
	}
}
