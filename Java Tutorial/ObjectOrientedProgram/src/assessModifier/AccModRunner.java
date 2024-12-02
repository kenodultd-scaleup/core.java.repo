package assessModifier;

public class AccModRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer comput = new Computer(89, "Dell", 80);
		String smallname = comput.ComputerName;
		System.out.println("I have just gotten a new laptop called " + smallname +", I will be using it for my Java coding classes");
		comput.playmusic();
	}

}
