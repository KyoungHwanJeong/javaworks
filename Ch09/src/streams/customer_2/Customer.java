package streams.customer_2;

public class Customer {

	private String name;	// 고객의 이름
	private int age;		// 고객의 나이
	private int price;		// 여행 비용
	
	public Customer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}
}
