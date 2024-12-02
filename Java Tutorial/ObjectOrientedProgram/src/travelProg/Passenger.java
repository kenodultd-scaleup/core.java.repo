package travelProg;

import java.util.Scanner;

public class Passenger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myConsoleScanner = new Scanner(System.in);
		System.out.println("Where are you going to?");
		String Destination = myConsoleScanner.nextLine();
		
		BusTicketStand standA = new BusTicketStand();
		standA.SellTicket(Destination);
		
	}

}
