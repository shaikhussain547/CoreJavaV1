package OOPConcept;

public class CarConst {
	
	String name;
	int price;
	String engine;
	
	public CarConst(String name, int price, String engine) {
		this.name = name;
		this.price = price;
		this.engine = engine;
	}
	
	public void details() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(engine);
	}

	public static void main(String[] args) {
		
		CarConst obj1 = new CarConst("BMW", 10, "Automatic");
		CarConst obj2 = new CarConst("Audi", 20, "Automatic");
		CarConst obj3 = new CarConst("Honda", 5, "Manual");
		
		obj1.details();
		obj2.details();
		obj3.details();
	}

}
