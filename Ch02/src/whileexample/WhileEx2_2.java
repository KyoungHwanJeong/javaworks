package whileexample;

public class WhileEx2_2 {

	public static void main(String[] args) {

		// 1부터 10까지의 합계
		// 변수 - num, sum
		
		int num=0, sum=0;
		
		while(num <= 10) {
			sum += num;
			num++;
			System.out.println("num= " + num + ", sum= " + sum);

		}
		System.out.println("합계는 " + sum + "입니다.");
	}

}
