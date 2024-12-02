package ConditionalStatement;

public class ElseIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Love";
		
		if(name.equalsIgnoreCase("Nokia 3310")) {
			System.out.println("This is a Nokia Inc.");
		}else if(name.equalsIgnoreCase("I phone 6")) {
			System.out.println("This is an Iphone Inc.");
		}else if(name.equalsIgnoreCase("Samsung")) {
			System.out.println("This is a Samsung Inc.");
		}else if(name.equalsIgnoreCase("Motorola")) {
			System.out.println("This is a Motorola Inc.");
		}else if(name.equalsIgnoreCase("Chinko")) {
			System.out.println("This is a Chinko Inc.");
		}else if(name.equalsIgnoreCase("Trium")) {
			System.out.println("This is a Trium Inc.");
		}else {
			System.out.println("This is not a phone");
		}
	}

}
