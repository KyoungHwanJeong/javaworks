package transport_2;

public class Subway {

	private String lineNumber;
	private int passengerNum=0;
	private int money;
	
	Subway(String lineNumber){
		this.lineNumber=lineNumber;
	}
	
	public void takeSubway(int fee) {
		money +=fee;
		passengerNum++;
	}
	
	public void showSubwayInfo() {
		System.out.printf("%s의 지하철 승객은 %d 명이고 수입은 %d 원입니다.\n"
				,lineNumber,passengerNum,money);
	}
}
