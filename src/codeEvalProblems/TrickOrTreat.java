package codeEvalProblems;

public class TrickOrTreat {

	public static void main(String[] args){
		String line = "Vampires: 1, Zombies: 1, Witches: 1, Houses: 1";
		String numbersOnly = line.replaceAll("[^0-9]", "");
		
		int a = numbersOnly.length();
		
		
		//for (i = 0; i < a; i++){
			//candysum
		}
		
		System.out.println(numbersOnly);
		//System.out.print(costumeArray(line));
		
	}
	
	/*public static int costumeArray(String costumeDescription){
		String cArray[] = costumeDescription.split(" ");
		int candySum;
		
		int vampires = Integer.parseInt(cArray[2]);
		int zombies = Integer.parseInt(cArray[4]);
		int witches = Integer.parseInt(cArray[6]);		
		int houses = Integer.parseInt(cArray[8]);
		
		candySum = vampires + zombies + witches + houses;
		System.out.print(vampires);
		return candySum;
	}*/
}
