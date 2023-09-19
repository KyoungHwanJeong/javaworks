package interfaceex.sortp346;

public interface Sort {

	public void ascending(int[] list);
	
	public void descending(int[] list);
	
	default void description() { 
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	}
}
