package interfaceex.sortp346_2;

public class HeapSort implements Sort{

	String sortName = "HeapSort";
	
	@Override
	public void ascending(int[] list) {
		System.out.println("HeapSort ascending 입니다.");
	}

	@Override
	public void descending(int[] list) {
		System.out.println("HeapSort descending 입니다.");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println(sortName + " 입니다.");
	}

	
}
