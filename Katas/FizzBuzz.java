package Katas;

public class FizzBuzz {
	
	public String play(int number) {
		
		if (number / 3 == 1) {
			return "Fizz";
		}else {
			return String.valueOf(number);
		}
		
	}

}