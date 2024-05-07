package PractiseProg;

public class ReverseInteger {

	public static void main(String[] args) {
		
		//1.Using algorithm:
		int num = 54321;
		int rev = 0;
		
		while(num != 0) {
			rev = rev *10 + num%10;
			num = num/10;
			
		}
		
		System.out.println("Reverse number is: "+rev);
		
		//2. Using StringBuffer Method:
		
		long num1 = 87654321;
//		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
		String s = String.valueOf(num1);
		StringBuffer s1 = new StringBuffer(s);
		System.out.println("Reverse number is: "+s1.reverse());
		
		
	}

}
