package assessModifier;

public class Computer {

	private int numOfPC;
	public String ComputerName;
	private double ComputerPrice;
	
	public Computer(int numOfPC, String computerName, double computerPrice) {
		this.numOfPC = numOfPC;
		this.ComputerName = computerName;
		this.ComputerPrice = computerPrice;
	}
	
	
	public void playmusic() {
		System.out.println("My name is "+ ComputerName + " and I can play music");
		this.testMusic();
		this.testMusic2();
	}
	
	private void testMusic() {
		System.out.println("This is the music test for private method");
	}
	
	private void testMusic2() {
		System.out.println("This is the second music test for private method");
	}
}
