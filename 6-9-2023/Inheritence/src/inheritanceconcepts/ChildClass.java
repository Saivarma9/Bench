package inheritanceconcepts;

public class ChildClass extends SuperClass {

	ChildClass(){
		this(10);
		System.out.println("No Arg ChildClass Constructor");
	}
	public ChildClass(int x) {
		super(10);
		System.out.println("One Arg ChildClass Constructor");
	}
	public static void main(String[] args) {

		ChildClass c= new ChildClass();
	}

}
