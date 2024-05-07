package ExceptionHandling;
//Throw Keyword
public class ThrowKeyword {

	public static void main(String[] args)  {
		
		System.out.println("ABC");
		
		try {
			throw new Exception("Naveen Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("PQR");
		
		String Exec_Flag = " ";
		if(Exec_Flag.equals(" ")) {
			try {
			throw new Exception("Exec flag is NO Exception");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Test");
		
	}

}
