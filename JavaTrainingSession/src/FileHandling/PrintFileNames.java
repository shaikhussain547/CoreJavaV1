package FileHandling;

import java.io.File;
import java.util.Arrays;

public class PrintFileNames {

	public static void main(String[] args) {
		
		String path = "C:\\\\Users\\\\hussa\\\\OneDrive\\\\Documents\\\\Invoices";
		File file = new File(path);
		File downloadDirectory[] = file.listFiles();
		Arrays.sort(downloadDirectory);
		for(File e : downloadDirectory ) {
			if(e.isFile()) {
				System.out.println("File : "+e.getName());
			}
			else if(e.isDirectory()) {
				System.out.println("Directory : "+ e.getName());
			}
		}
		
		
	}

}
