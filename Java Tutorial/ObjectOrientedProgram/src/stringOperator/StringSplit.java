package stringOperator;

public class StringSplit {

	
	public void showWords() {
		String statement = "This is the man who lost his money in the pool yesterday";
		String [] words = statement.split("o");
		for (int i = 0; i<words.length; i++) {
			System.out.println(words[i]);
		}
	}
	
	
	public String[] getAnimalNames() {
		String animalNames = "Chicken, Tiger, Lion, Bull, Bufalo";
		
		String [] names = animalNames.split(",");
		
		for (int i = 0; i<names.length; i++) {
			String name = names[i];
			System.out.println(name);
		}
		
		return names;
	}
	
}
