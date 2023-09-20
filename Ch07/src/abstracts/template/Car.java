package abstracts.template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 템플릿 메서드 정의 : 상속 받는 클래스에서 수정할 수 없다.
	// 반드시 final을 붙여야 한다!
	public final void run() {
	
		startCar();
		drive();
		stop();
		turnOff();
		
	}
}
