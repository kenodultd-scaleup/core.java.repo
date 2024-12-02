package variables;

public class VariableRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalVariable run = new LocalVariable();
		run.example();
		
		InstanceVariable run2 = new InstanceVariable();
		System.out.println(run2.instExam);
		
		VaribleUses run3 = new VaribleUses();
		run3.Tota();
		int newTes = run3.PassMtd(4, 7);
		int newTes1 = run3.PassMtd(5, 90);
		System.out.println(newTes + newTes1);
		System.out.println(newTes1);
	}

}
