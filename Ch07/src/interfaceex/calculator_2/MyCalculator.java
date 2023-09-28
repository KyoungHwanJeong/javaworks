package interfaceex.calculator_2;

public class MyCalculator implements Calculator{

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int sub(int num1, int num2) {
		return num1-num2;
	}

	@Override
	public int mul(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public double div(int num1, int num2) {
		if(num2!=0) {
			return num1/num2;
		}else {
			return ERROR;
		}
	}

}
