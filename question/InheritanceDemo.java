package question;

public class InheritanceDemo {
public static void main(String[] args) {
	NRIAccount account= new NRIAccount();
	SeniorCitizenAccount account2 = new SeniorCitizenAccount();
	account.applyFixedDeposit();
	account2.applyFixedDeposit();
//	BankAccount account3= new BankAccount();
//	
//	account3.depositMoney();
//	account3.withdrawMoney();
	// obviously we can create an object of bank account class and get the balance 
	//but using inheritance we did that using base class code 
	account.depositMoney();
	account.withdrawMoney();
	


	
}
}
