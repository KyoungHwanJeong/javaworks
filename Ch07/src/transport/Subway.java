package transport;

public class Subway {

	// 필드
	String lineNumber;		// 지하철 호선
	int passenger;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	public void take(int fee) {
		this.money+=fee;
		passenger++;
	}
	
	public void showSubwayInfo() {
		System.out.printf("%s 지하철의 수입은 %d원이고, 승객 수는 %d명 입니다.\n"
				,lineNumber, money, passenger);
	}
}
