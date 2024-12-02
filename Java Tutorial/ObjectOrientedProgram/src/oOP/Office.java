package oOP;

public class Office {

	String Location1 = "Dagenham";
	String Location2 = "Central";
	String Location3 = "WFH";
	
	
	
	public void Movement () {
		if (Location1.matches(Location2))
		System.out.println("I will be driving to the office");
		
		else if (Location2.endsWith(Location1))
			System.out.println("I will be travelling by public transport to the office");
		
		else if (Location3.endsWith(Location3))
			System.out.println("I will be working from home");
	
	}
	
}


