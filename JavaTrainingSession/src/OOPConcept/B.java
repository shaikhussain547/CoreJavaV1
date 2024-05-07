package OOPConcept;

//Super keyword
public class B extends A {

	// super keyword is used to call parent class constructor.
	// super keyword should be the first statement in constructor.
	// super keyword should be written inside the child class always.
	// inside a constructor we can not have a two super keywords.

	public B() {
		super();
//		super(11,22);
		System.out.println("child class const -- o parameters");
	}

	public B(int i) {
		super(i);
		System.out.println("child class const -- 1 parameters");
	}

	public B(int i, int j) {
		super(i, j);
		System.out.println("child class const -- 2 parameters");
	}

	public static void main(String[] args) {

		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10, 20);

		// ctrl+shift+f  : To remove unnecessary gaps

	}
}
