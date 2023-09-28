package inheritance.transport_2;

public class Vehicle {

	protected String vehicle_Name;		// 차량 이름
	protected int vehicle_Income;		// 수입
	int passenger_Count;				// 승객 수
	
	public Vehicle (String vehicle_Name){
		this.vehicle_Name=vehicle_Name;
	}
	
	public void ride_Vehicle(int fare) {
		this.vehicle_Income += fare;
		passenger_Count++;
	}
	
	public void showVehicleInfo() {
		System.out.println(vehicle_Name + "의 수입은 "
				+ vehicle_Income +"이고, 승객 수는 "
				+ passenger_Count + "명 입니다.");
	}
}
