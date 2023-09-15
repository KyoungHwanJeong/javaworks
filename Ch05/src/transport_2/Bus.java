package transport_2;

public class Bus {

	private int busNumber;
	private int passengerNum=0;
	private int money;
	
	Bus(int busNumber){
		this.busNumber=busNumber;
	}
	
	public void takeBus(int fee) {
		this.money+=fee;
		passengerNum++;
	}
	
	public void showBusInfo() {
		System.out.printf("%d 번 버스의 승객은 %d 명이고, 버스 수입은 %d원 입니다.\n"
				, busNumber, passengerNum,money);
	}
}
