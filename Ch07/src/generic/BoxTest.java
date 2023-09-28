	/*
	 * 제너릭 사용하기
	 * 1. 문자형 타입 box1 객체를 생성하고, "행운을 빌어요!"를
	 * 저장하고, 출력하기.
	 * 
	 * 2. 숫자형 타입 box2 객체를 생성하고, 300을 저장하고, 출력하기.
	 * 
	 * 3. Fruit 형 타입 box3 객체를 생성하고 "사과"를 저장하고, 출력하기.
	 * 
	*/

package generic;

public class BoxTest {
	
	public static void main(String[] args) {

		// 문자형 타입으로 객체를 생성
		Box<String> box1 = new Box<>();
		box1.set("행운을 빌어요!");
		String msg = box1.get();
		System.out.println(msg);
		
		//숫자형 타입으로 객체 생성
		Box<Integer> box2 = new Box<>();
		box2.set(300);
		Integer num = box2.get();
		System.out.println(300);
		
		//Fruit 형 타입으로 객체 생성
		Box<Fruit> box3 = new Box<>();
		box3.set(new Fruit("사과"));
		Fruit apple = box3.get();
		System.out.println(apple);
	}

}
