package fizzBuzz;

public class FizzBuzz {

	public String fizz(Integer input) {
		if(input % 3 == 0 && input % 5 == 0){
			return "FB";
			
		} else if (input % 3 == 0) {
			return "F";
			
		}else if (input % 5 == 0) {
			return "B";
			
		} else {
			return  input.toString();
		}
	
	}


	
}

