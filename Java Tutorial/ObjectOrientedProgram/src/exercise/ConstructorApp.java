package exercise;

public class ConstructorApp {

	private int accountamt;
	
	
	
	public ConstructorApp(){
		this.accountamt = 2000;
	}

	public void getAcctBal() {	
		String message = "Your balance is " + accountamt;
		System.out.println(message); 
	}
	
	public void deposit (int Amount) {
		int BalAftDep = accountamt + Amount;
		this.accountamt = BalAftDep;
		String message = "Your new balance is " + BalAftDep;
		System.out.println(message); 
	}

}
