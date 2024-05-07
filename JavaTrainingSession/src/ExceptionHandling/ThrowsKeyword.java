package ExceptionHandling;
//Throws keyword
public class ThrowsKeyword {

	public static void main(String[] args) {
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("ABC");
		
	}
	
	public void sum() {
		try {
			div();
		}catch(ArithmeticException e) {//object(super class) --> Throwable(class) --> 1. Error, 2. Exception
			
		}
		
	}
	
	public void div() throws ArithmeticException{
		int i = 9/0; //exception line
	}

}
