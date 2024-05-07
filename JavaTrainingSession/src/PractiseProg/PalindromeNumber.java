package PractiseProg;

public class PalindromeNumber {

	//151, 454, 34543, 161, 78987
	
	public static void isPalindromeNumber(int num) {
		System.out.println("Given number is : "+num);
		int rev=0;
		int sum=0;
		int temp;
		
		temp = num;
		while(num>0) {
			rev = num%10;	//get the remainder
			sum = (sum*10)+rev;
			num = num/10;
		}
		
		if(temp == sum) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not a Palindrome Number");
		}
		
	}
	
	public static void main(String[] args) {
		
		isPalindromeNumber(151);
		isPalindromeNumber(153);
		
	}

}
