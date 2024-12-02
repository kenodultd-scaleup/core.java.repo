package IfElse;

public class JambScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int JambScore = 54;
		
		if (JambScore >= 75 && JambScore <= 100) {
			System.out.println("Your score is A");
		}
		
		else if (JambScore <= 75 && JambScore >= 65) {
			System.out.println("Your score is B");
		}
		
		else if (JambScore <= 64 && JambScore >= 55) {
			System.out.println("Your score is C");
		}
		
		else if (JambScore <= 54 && JambScore >= 50) {
			System.out.println("Your score is D");
		}
		
		else if (JambScore <= 49 && JambScore >= 40) {
			System.out.println("Your score is E");
		}
		
		else if (JambScore <= 40) {
			System.out.println("Your score is F");
		}
		
		else {System.out.println("Your score does not exist");
		
		}
	}

}
