 package javaBasics;

public class StringConcept {
	
/*		Why String is Immutable and Final?
 * 
 * 		1. String Pool in Method Area.
 * 		2. Security
 * 		3. Class loading Mechanism
 * 		4. Optimization & Performance
 * 		5. Integer, Long, Double, Float -- Wrapper Classes -- Immutable and Final
 *
 */

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Java";
		s2 = "Naveen";
		String s3 = "C++";
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
