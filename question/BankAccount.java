package question;

public class BankAccount {
	float depositAmount=3000;
	float withdrawAmount=2000;
	double interestRate = 9.5;
	double balance=8000;

	public double depositMoney() {
		
		balance += depositAmount;
		System.out.println("the amount deposited is " + depositAmount +"and new balance is "+balance);
		return balance;

	}

	public double withdrawMoney() {
		
		balance = depositAmount - withdrawAmount;
		System.out.println("amount withdrawn is " + withdrawAmount+" and balance is "+balance);
		return balance;

	}
}
