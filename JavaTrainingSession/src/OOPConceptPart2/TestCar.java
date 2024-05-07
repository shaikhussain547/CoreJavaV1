package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism / compile-time polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("******");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		System.out.println("******");
		
		//Top casting
		Car c1 = new BMW(); //child class object can be referred by parent class reference variable -- dynamic polymorphism --> run time polymorphism
		c1.start();
		c1.stop();	//only overriden methods and parent methods can be accessible by using run time/dynamic polymorphism.
		c1.refuel();
		c1.engine();
		
		//Down casting is not allowed
		//BMW b1 = (BMW)new Car(); //ClassCastException
		
		
		
	}

}
