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

package generic_2;

public class BoxTest {

	public static void main(String[] args) {

		System.out.println("============1===================");
		Box<String> box1 = new Box<String>();
		box1.setBox("행운을 빌어요!");
		System.out.println(box1.getBox());
		
		System.out.println("============2===================");

		Box2<Integer> box2 = new Box2<Integer>();
		box2.setBox2(300);
		System.out.println(box2.getBox2());
		
		System.out.println("============3===================");

		Box<Fruit> box3 = new Box<>();
		box3.setBox(new Fruit("사과"));
		System.out.println(box3.getBox());
	}

}
