package AbstractionConcept;
//Abstract class
public abstract class Shape {
	
	//hiding the implementation logic -- is called Abstraction
	//partial abstraction
	//Abs class can have abs methods and non abs methods
	//can not create the object of abstract classes
	
	Shape(){
		System.out.println("Shape class constructor");
	}
	
	int color;
	
	abstract void drawing();
	
	public void fill() {
		System.out.println("Shape -- fill");
	}
	
	//can not create object of interface
	
	
	
}
