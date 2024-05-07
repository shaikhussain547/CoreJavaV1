package javaBasics;

public class StringConcatenation {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double c = 12.33;
		double d = 10.33;
		
		System.out.println(a+b); //300
		System.out.println(x+y); //HelloWorld
		
		System.out.println(a+b+x+y);//300HelloWorld
		System.out.println(x+y+a+b);//HelloWorld100200
		System.out.println(x+y+(a+b));//HelloWorld300
		
		System.out.println(a+b+x+b+a+y);//300Hello200100World		
	}
}
