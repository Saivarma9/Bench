package DemoPrograms;

public class BankAccount {
	
	static String bankName = "AndraBank";
	
	String accountHolderName ;

	String accountNumber ;
	
	double balance ;
	
	public static void main(String[] args) {
		double loanInterestRate = 7.5d;
		System.out.println("LoanInterestRate" + loanInterestRate);
		
		System.out.println(BankAccount.bankName);
		
		BankAccount bankAccount = new BankAccount();
		
		bankAccount.accountHolderName = "Samanth";
		bankAccount.accountNumber = "047010100117890";
		bankAccount.balance = 200000;
		
		System.out.println(bankAccount.balance);
	}
}
