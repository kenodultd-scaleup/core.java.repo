package ConversionType;

public class StringToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String YesterdayFuelPrice = "500";
		String TodayFuelPrice = "750";
		
		double Price1 = Double.parseDouble(YesterdayFuelPrice);
		double Price2 = Double.parseDouble(TodayFuelPrice);
		
		System.out.println (Price2 - Price1);
	}

}
