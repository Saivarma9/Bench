
public class Switch {
	
	public static void main(String[] args) {
		
		String choice = "Check Deposit";
		
		switch(choice) {
		
		default : 
			System.out.println("Time Out");
		    break;
		case "Check Balance":
			System.out.println("Check Balance");
			break;
		case "Check Deposit":	
			System.out.println("Check Deposit");
			break;
		case "ATM Pin Change":
			System.out.println("ATM Pin Change");
			break;
		case "WithDraw" :
			System.out.println("WithDraw");
			break;
		}
	}

}
