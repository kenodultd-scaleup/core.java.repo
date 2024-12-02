package DataConversion;

public class StringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Convert = 100;
		String Newconvert = (Integer.toString(Convert));
		System.out.println("My conversion skills has gone to " + Newconvert);
		
		
		String Convert2 = "50";
		int Newconvert2 = (Integer.parseInt(Convert2));
		System.out.println("My conversion skills is now 50/" + Newconvert2);
		
		double Convert3 = 100;
		String Newconvert3 = (Double.toString(Convert3));
		System.out.println("My conversion skills has gone to " + Newconvert3);
	
	}

}
