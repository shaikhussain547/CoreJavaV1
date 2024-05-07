package javaBasics;

public class IfElseConcept {
	public static void main(String[] args) {
		//comparison operators:
		//<,>,<=,>=,==,!=
		int a = 10;
		int b = 20;
		
		if(b>a) {
			System.out.println("b is grater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		//write a logic to find out the highest among three
		int a1 = 300;
		int b1 = 400;
		int c1 = 200;
		//nested if-else
		if((a1>b1)&&(a1>c1)) {
			System.out.println("a1 is the greatest");
		}
		else if(b1>c1) {
			System.out.println("b1 is the greatest");
		}
		else {
			System.out.println("c1 is the greatest");
		}
		
		//Switch : The switch statement enables to select a block from a set of options.
		//It allows the flow of execution to be switched according to a value.
		//When a match found, the set of statements present in that case are executed until a break
		//or till the end of switch block,whichever occurs first.
		String orderFood = "Pizza";
		switch(orderFood) {
		case "Burger":
			System.out.println("Order1 is placed");
			break;
		case "Pizza":
			System.out.println("Order2 is placed");
			break;
		case "Bread":
			System.out.println("Order3 is placed");
			break;
		default:
			System.out.println("Invalid selection");
		}
	}
}