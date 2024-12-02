package exercise;

public class BankAccount {

	private int accountamt;
	
	
	
//	public BankAccount(int accountamt) {
//		this.accountamt = 2000;
//	}

	public void checkBal() {
		accountamt = 2000;
		System.out.println(accountamt);
		
	}
	
	public void withDraw(int randonwitdraw) {
	int balAfterWith = accountamt - randonwitdraw;
	System.out.println(balAfterWith);
		
	}
	
	public void deposit(int check) {
		int balAfterWith = accountamt + check;
		System.out.println(balAfterWith);
			
		}
}
