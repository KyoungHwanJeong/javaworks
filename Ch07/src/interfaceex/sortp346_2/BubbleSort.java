package interfaceex.sortp346_2;

public class BubbleSort implements Sort{

	String sortName="BubbleSort";
	
	@Override
	public void ascending(int[] list) {
		System.out.println("BubbleSort ascending 입니다.");
	}

	@Override
	public void descending(int[] list) {
		System.out.println("BubbleSort descending 입니다.");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println(sortName + " 입니다.");
	}

	
}
