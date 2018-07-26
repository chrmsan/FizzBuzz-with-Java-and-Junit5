package Katas;

public class FizzBuzz {
	
	public String play(int number) {
		
		if (number / 3 == 1) {
			return "Fizz";
		}else if (number / 5 == 1) {
			return "Buzz";	
		}else{
			return String.valueOf(number);
		}
		
	}

}