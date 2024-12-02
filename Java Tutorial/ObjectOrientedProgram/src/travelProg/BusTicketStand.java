package travelProg;

public class BusTicketStand {

	String StandName = "A";
	String SellerName = "Jack";
	
	
	public void SellTicket(String Destination) {
		if (Destination.equalsIgnoreCase("London")) {
			London southEastLdn = new London();
			System.out.println(southEastLdn.price01);
		}
		
		else if (Destination.equalsIgnoreCase("Gatwick")) {
			Gatwick airport = new Gatwick();
			System.out.println(airport.price03);
		}
		
		else if (Destination.equalsIgnoreCase("Luton")) {
			Luton TrainStation = new Luton();
			System.out.println(TrainStation.price02);
		}
		else {
			System.out.println("There is no such destination on our route");
		}
	}
	
	public void GiveDirection() {
		
	}
}
