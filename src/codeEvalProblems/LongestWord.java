package codeEvalProblems;

public class LongestWord {

	
	
	public static void main(String[] args){
		
		String line = "Super cat likes dogs.";
	
		System.out.println(longestWord(line));
			
		}
	public static String longestWord(String sentence){
		String sCompare;
		String[] sArray = sentence.split(" ");
		sCompare = sArray[0];
		
		for (int i = 1; i < sArray.length; i++){
		if(sCompare.length() < sArray[i].length() ){
			sCompare = sArray[i];
		}
		}
		
		return sCompare; 
	}
}
 