package interfaceex.sortp346;

public class HeapSort implements Sort{

	String sortName= "HeapSort";

	@Override
	public void ascending(int[] list) {
		System.out.println("HeapSort ascending");
		
	}

	@Override
	public void descending(int[] list) {
		System.out.println("HeapSort descending");
		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.printf("%s 입니다.\n", sortName);
	}
}
