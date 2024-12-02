package oOP;

public class NewTestingRole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Home home = new Home();
		home.Raining();
		Office OfficeTravel = new Office();
		OfficeTravel.Movement();
		System.out.println("I have the location of work at " + OfficeTravel.Location2);
		String Mark = OfficeTravel.Location2 = "I will be working in a New Location";
		System.out.println(Mark);

		//home.Raining();
		//home.Sunny();
	}

}
