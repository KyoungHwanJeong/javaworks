package interfaceex.sortp346;

public class BubbleSort implements Sort{

	String sortName= "BubbleSort";
	
	@Override
	public void ascending(int[] list) {
		System.out.println("BobbleSort ascending");
	}

	@Override
	public void descending(int[] list) {
		System.out.println("BobbleSort descending");

	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.printf("%s 입니다.\n", sortName);
	}
}
