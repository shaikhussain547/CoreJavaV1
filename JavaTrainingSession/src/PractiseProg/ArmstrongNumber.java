package PractiseProg;

public class ArmstrongNumber {

	//153 --> 1+125+27 = 153
	//407 --> 64+343 = 407
	//0,1 also armstrong number.
	
	public static void isArmstrongNumber(int num) {
		System.out.println("Given number is: "+num);
		int cube =0;
		int rem;
		int temp;
		
		temp = num;
		
		while(num>0) {
			rem = num%10;
			num = num/10;
			cube = cube+(rem*rem*rem);
		}
		
		if(temp==cube) {
			System.out.println("This is an Armstrong Number");
		}else {
			System.out.println("This is not an  Armstrong Number");
		}
			
	}
	
	
	public static void main(String[] args) {
		
		isArmstrongNumber(153);
		isArmstrongNumber(371);
		isArmstrongNumber(370);
		isArmstrongNumber(123);
		
		
	}

}
