package inheritanceconcepts;

public class Child extends Parent {

	int c,d;
	
	Child (int a, int b, int c, int d){
		super(a,b);
		this.c = c;
		this.d = d;
	}
	void f1() {
		super.f1();
		System.out.println("Inside Childs f1()");
	}
	public void displayDetails() {

		System.out.println("Parents a "+ super.a);
		System.out.println("Parents b "+ super.b);
		
		System.out.println("Childs c "+ this.c);
		System.out.println("Childs d "+ this.d);
	}
}
