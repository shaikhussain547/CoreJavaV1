package ExceptionHandling;
//Try catch block
public class ExceptionHandlingConcept {
	
//	int a = 10;

	public static void main(String[] args) {
		
		//uncaught exception:
//		int i = 9/0;
//		System.out.println(i);
		
		//caught exception:
//		Thread.sleep(2000);
		
		//1. try - catch block: 
		try{
			int i = 9/0;//this code will throw an exception
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("ABC");
		
		
	}

}
