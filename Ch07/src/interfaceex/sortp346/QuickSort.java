package interfaceex.sortp346;

public class QuickSort implements Sort{

	String sortName= "QuickSort";

	@Override
	public void ascending(int[] list) {
		System.out.println("QuickSort ascending");
		
	}

	@Override
	public void descending(int[] list) {
		System.out.println("QuickSort descending");
		
	}

	@Override
	public void description() { 
		Sort.super.description();
		System.out.printf("%s 입니다.\n", sortName);
	}
}
