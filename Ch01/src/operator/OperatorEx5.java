package operator;

public class OperatorEx5 {

	public static void main(String[] args) {

		// 1증가, 1 감소 연산자(++, --)
		
		int num = 10;		
//		num = num +1;

//		num += 1;	// 복합 대입연산자
		num++;	// 1증가 ,	 반복문에서 많이 쓴다.
		
		
		System.out.println(num);

		

		int num2 = 20;
//		num2 = num2 -1

//		num2 -= 1;
		num2--;	// 1감소
		
		System.out.println(num2);
		
		int val = 100;

		System.out.println(val += 1);	// val = val + 1
		System.out.println(val -= 1);	// val = val - 10
		System.out.println(val *= 10);	// val = val * 10
		System.out.println(val /= 10);	// val = val / 10

	
		
		
	}

}
