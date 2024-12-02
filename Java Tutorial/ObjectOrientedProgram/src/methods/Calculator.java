package methods;

public class Calculator {

	public void addTwoNumbers1() {
		int a = 9;
		int b = 15;
		
		int result = a + b;
		System.out.println("Your final result is " + result);
		
	}
	
	public void addTwoNumbers2(int x, int y) {
//		int a = 9;
//		int b = 15;
		
		int result = x + y;
		System.out.println("Your final result is " + result);

	}
	
	public String addTwoNumbers3(int x, int y) {
//		int a = 9;
//		int b = 15;
		
		int result = x + y;
		return "Your final result is " + result;

	}
}
