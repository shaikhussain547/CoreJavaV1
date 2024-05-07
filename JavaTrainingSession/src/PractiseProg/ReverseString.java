package PractiseProg;

public class ReverseString {

	public static void main(String[] args) {
		
		//Reverse a String:
		
		String s = "Automation";
		
		//1. Using for loop:
		String rev = "";
		
		int len = s.length();
		System.out.println("Length of string s is :"+len);//10
		
		for(int i=len-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse of Automation is :"+rev);
		
		
		//2. Using string buffer class:
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
	}

}
