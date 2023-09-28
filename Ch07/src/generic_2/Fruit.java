package generic_2;

public class Fruit <Fruit>{

	Fruit fruit;
	
	public Fruit(Fruit fruit){
		this.fruit=fruit;
	}

/*	
	public String getFruit() {
		return (String)fruit;
	}
*/	

	@Override
	public String toString() {
		return (String) fruit;
	}

}
