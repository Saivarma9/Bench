package packageA;

public class ClassA {

	public    int w = 40;
	private   int x = 10;
	          int y = 20;
	protected int z = 30;

	public static void main(String[] args) {

		ClassA a = new ClassA();

		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println(a.z);
		System.out.println(a.w);
	}

}
