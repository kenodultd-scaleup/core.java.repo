package variables;

public class VaribleUses {

	
	
	//Storing Value
	int age = 35;
	String name = "Kenny";

	//Manipulating Data
	int numofChicken = 20;
	int numOfNest = 5;
	
	int Total = numofChicken * numOfNest;
	
	public void Tota() {
		System.out.println(Total);
	}

	//Passing data to Methods
	
	public int PassMtd(int numberOfSchool, int numberOfSchool2) {
		return numberOfSchool * numberOfSchool2;
	}
}
