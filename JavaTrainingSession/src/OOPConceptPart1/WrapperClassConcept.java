package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);//10020
		System.out.println(20+x);//20100
		
		//Data conversion from String to int:
		int i = Integer.parseInt(x);
		System.out.println(i); //100
		System.out.println(i+20);//120
		
		//Integer, Double, Character, Boolean
		
		//String to double conversion
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d);
		
		//String to boolean:
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to String conversion:
		int j = 200;
		System.out.println(j+20); //220
		
		String s = String.valueOf(j);
		System.out.println(s+20); //20020
		
		String u = "100A";
		//Integer.parseInt(u);//NumberFormatException -- For input string "100A"
		
	}

}
