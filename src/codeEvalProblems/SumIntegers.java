package codeEvalProblems;

public class SumIntegers {

	public static void main(String[] args){
		String line = "15";
		int number = Integer.parseInt(line);
		int sum = 0;
		do { 
			
            sum+= number; 
        } while(number != 0);

		System.out.println(number);
		
	}
}
