package interfaceex.sortp346_2;

public class QuickSort implements Sort{

	String sortName="QuickSort";
	
	@Override
	public void ascending(int[] list) {
		System.out.println("QuickSort ascending 입니다.");
	}

	@Override
	public void descending(int[] list) {
		System.out.println("QuickSort descending 입니다.");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println(sortName + " 입니다.");
	}
	
	

}
