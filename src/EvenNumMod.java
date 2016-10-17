//print 1 for even and 0 for odd
public class EvenNumMod {

	public static void main(String[] args){
		
		String line = "701"; //always put String line = for input problems
		int number = Integer.parseInt(line);
		
		if (number % 2 == 0){
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}

	}
}
