
public class IfElseLadder {

	public static void main(String[] args) {
		
	String choice = "ATM Pin Change";
	
	if(choice=="Check Balance") {
		System.out.println("Check Balance");
	}
	else if(choice=="Check Deposit") {
		System.out.println("Check Deposit");
	}
	else if(choice=="WithDraw") {
		System.out.println("WithDraw");
	}
	else if(choice=="ATM Pin Change") {
		System.out.println("ATM Pin Change");
	}
	else {
		System.out.println("Time Out");
	}
	
	}
}
