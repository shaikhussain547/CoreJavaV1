package PractiseProg;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "&^%$$**@@ latin )(**& String";
		String s1= "&^%$$**@@ Testing (**& Java";
		
		//Use Regular Expression : [^a-zA-Z0-9]
		
		//1. Replace All Method
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}

}
