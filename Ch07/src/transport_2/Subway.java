package transport_2;

public class Subway {

	public String subwayNum;
	public int passenger;
	public int subwayIncome;
	
	public Subway(String subwayNum) {
		this.subwayNum=subwayNum;
	}
	
	public void takeSubway(int fee) {
		subwayIncome+=fee;
		passenger++;
	}
	
	public void showSubwayInfo() {
		System.out.printf("%s 지하철의 수입은 %d원이고, 승객 수는 %d명입니다.\n"
				,subwayNum, subwayIncome, passenger);
	}

}
