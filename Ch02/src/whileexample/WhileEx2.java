package whileexample;

public class WhileEx2 {

	public static void main(String[] args) {

		// 1부터 10까지의 합계
		// 변수 - num, sum
		
		int num=0, sum=0;
		
		/*
		 n += 1;	// 0+1=1
		 n += 2;	// 1+2=3
		 n += 3;	// 3+3=6
		 */
		
		
		while(num < 10) {
			
			num++;
			sum += num;
			System.out.println("num= " + num + ", sum= " + sum);
			
			
			
		}
		
		
		
		System.out.println("합계= " + sum);
	}

}
