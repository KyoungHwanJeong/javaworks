package ifexample;

public class SeatsCal {

	public static int seatcal(int customer, int column){
		
		
		int row = (customer/ column)+1;
		int customer_remainder = 0;

		if(customer>= column) {
			if(customer % column != 0) {
				customer_remainder = customer % column;
				

			}else {
				customer_remainder=0;
			}
		}
		return customer_remainder;
		
	}
}
