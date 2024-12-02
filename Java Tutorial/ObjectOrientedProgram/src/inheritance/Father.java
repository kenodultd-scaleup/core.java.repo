package inheritance;

public class Father {

	String maritalStatus;
	int fatherAge;
	double fathersHeight;
	
	public Father() {
		this.fatherAge = 60;
		this.maritalStatus = "Single";
		this.fathersHeight = 6.2;
	}
	
	
	public void checkFathersProperties() {
		System.out.println(fathersHeight);
	}
}
