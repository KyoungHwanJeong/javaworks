package transport_2;

public class Bus {

	public int busNum;
	public int passenger;
	public int busIncome;
	
	public Bus(int busNum) {
		this.busNum=busNum;
	}
	
	public void takeBus(int fee) {
		this.busIncome+=fee;
		passenger++;
	}
	
	public void showBusInfo() {
		System.out.printf("%d번 버스의 수입은 %d원이고, 승객 수는"
				+ " %d명 입니다.\n", busNum, busIncome, passenger);
	}

}
