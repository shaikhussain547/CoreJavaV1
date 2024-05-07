package javaBasics;
public class LoopConcept {
	public static void main(String[] args) {
		//While loop : loop executes when condition is met.
		//Also called 'entry - controlled loop'.
		//While loop is used when the number of iterations are not known.
		//Infinite loop may generate if you don't give increment/decrement.
		int inputNumber = 7865;//Initialization
		int sum = 0;
		int temp = 0;
		while(inputNumber > 0) { //Conditional part
			temp = inputNumber % 10;
			sum += temp;	//Increment/Decrement
			inputNumber = inputNumber/10;
		}
		System.out.println(sum);
		
		//Do-while : When the loop has to be executed at least once before the condition is checked.
		//After the first execution, the loop then gets repeated as long as the condition is true.
		//Also called 'exit-controlled loop'.
		
		int i = 1;
		do {
			System.out.println(i);
			i += 1;
		}while(i <= 10);
		
		//For loop : is used when the number of iterations are known.
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
	}
}
