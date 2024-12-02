package ConversionType;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fuelpriceYesterday = "50";
		String fuelpriceToday = "250";
		
		int Price1 = Integer.parseInt(fuelpriceYesterday);
		int Price2 = Integer.parseInt(fuelpriceToday);
		
		System.out.println(Price2 - Price1);
		
	
	}

}
