package methods;

public class Revision {
	
	private String RevContd = "Chapter Constructor";
	private int RevContd1 = 18;
	private double RevContd2 = 1218;
	private boolean RevContd3 = true;
	
	
	
	
	public Revision(String revContd, int revContd1, double revContd2, boolean revContd3) {
		RevContd = revContd;
		RevContd1 = revContd1;
		RevContd2 = revContd2;
		RevContd3 = revContd3;
	}

	public void Rev01() {
		System.out.println("This is a new method revision test for the smart");
	}
	
	public void Rev02(String RevName, int RevNo, double RevChap, boolean RevCorrect) {
		System.out.println("This is a smarted mthd test " + RevName + " With the age number of 3" + RevNo );
	}
	
	public String Rev03() {
		System.out.println("This is a new method revision test for the smart");
		return "This is a new method revision test for the smart";
	}
}
