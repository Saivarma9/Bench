
public class DoWhile {
	public static void main(String[] args) {

		// To Print all The Even Numbers from 1 to 30

		int x = 1;
		do {
			if (x % 2 == 0) {
				System.out.println(x);
			}
			x++;
		} while (x <= 30);
	}
}
