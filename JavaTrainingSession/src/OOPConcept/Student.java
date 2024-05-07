package OOPConcept;
//Static concept
public class Student {
	
	int studentId;
	String studentName;
	static String collegeName="ABC Institute";
	
	Student(int id, String name){
		studentId = id;
		studentName = name;
	}
	
	void display() {
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(collegeName);
	}
	static void displayCollege() {
		System.out.println(collegeName);
	}

	public static void main(String[] args) {
		
/*		Student st1 = new Student(101, "John");
		st1.display();
		
		Student st2 = new Student(102, "Wick");
		Student.collegeName = "XYZ Institute";
		st2.display();		*/
		
		
	}

}
