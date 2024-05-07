package javaBasics;

public class TypeConversion {
	public static void main(String[] args) {
		//Implicit
		int num = 10;
		double value = num;
		System.out.println(value); //10.0
		
		//Explicit
		double total = 201.99;
		int price = (int)total;
		System.out.println(price); //201
		
		String name = "Hussain";
		
	}
}