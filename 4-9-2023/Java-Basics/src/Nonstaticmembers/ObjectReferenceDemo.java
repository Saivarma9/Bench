package Nonstaticmembers;

public class ObjectReferenceDemo {
	
	int num;
	
	ObjectReferenceDemo(){
		
	}
	
	public static void main(String[] args) {
		
		ObjectReferenceDemo obj = new ObjectReferenceDemo();
		
		System.out.println(obj);
		
		System.out.println(obj.num);
	}
	
	static {
		ObjectReferenceDemo obj1 = new ObjectReferenceDemo();
		System.out.println(obj1);
	}

}
