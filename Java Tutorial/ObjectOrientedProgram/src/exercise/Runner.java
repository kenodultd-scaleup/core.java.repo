package exercise;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount checkbal = new BankAccount();
		checkbal.checkBal();
		checkbal.withDraw(400);
		checkbal.deposit(400);
		
		
		ConstructorApp checkbal01 = new ConstructorApp();
		checkbal01.getAcctBal();
		checkbal01.deposit(500);
		
	}

}
