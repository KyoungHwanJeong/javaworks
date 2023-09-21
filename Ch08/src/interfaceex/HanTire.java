package interfaceex;

public class HanTire implements Tire {

	static int count;
	@Override
	public void roll() {
		count++;
		System.out.printf("%s 한타이어가 굴러갑니다.\n", count);
	}

}
