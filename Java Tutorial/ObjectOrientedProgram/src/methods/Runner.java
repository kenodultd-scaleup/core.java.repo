package methods;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calculator = new Calculator ();
		calculator.addTwoNumbers1();
		calculator.addTwoNumbers2(15, 30);
		String ans = calculator.addTwoNumbers3(90, 20);
		System.out.println(ans);
		
		ConstCal constr = new ConstCal();
		
		Revision revsn = new Revision("Mike", 30, 200, true);
		revsn.Rev01();
		revsn.Rev02("Mike", 30, 200, true);
		revsn.Rev03();
		
	}

}