package question;

public class NRIAccount extends BankAccount {
	public float applyFixedDeposit() {
		interestRate=6.5;
		System.out.println("the interest rate for this account is "+this.interestRate);

		return depositAmount;

	}

}
