package classes_2.constructor_2;

public class Person_2 {

	String name;
	float height;
	float weight;
	
	public Person_2(){
		
	}
	public Person_2(String name,float height,float weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;		
	}
	public void showPerson_2Info() {
		System.out.printf("이름: %s, 키: %.1f, 몸무게: %.1f\n",
				name, height, weight);
	}
	public String showPerson_2Info2() {
		return "이름: " + name + ", 키: " + height + ", 몸무게: "
				+weight;
	}
}
