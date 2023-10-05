package interfaceex2;

// Tire 인터페이스를 구현한 클래스(구현 클래스) - kumTire
public class KumTire implements Tire{

	static int count;
	@Override
	public void roll() {
		count++;
		
		System.out.printf("%s 금타이어가 굴러갑니다.\n", count);
		
	}

	
}
