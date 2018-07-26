package Katas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


class FizzBuzzTest {
	
	

	@Test
	@DisplayName("Returns input number as string")
	void returnInput() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = 2;
		String result = fizzbuzz.play(input);
		String expectedResult = "2";
		
		assertEquals(expectedResult, result);
	}
	
	@Test
	@DisplayName("Returns 'Fizz' when input number is 3")
	void returnFizz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = 3;
		String result = fizzbuzz.play(input);
		String expectedResult = "Fizz";
		
		assertEquals(expectedResult, result);
	}
	
	@Test
	@DisplayName("Returns 'Buzz' when input number is 5")
	void returnBuzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = 5;
		String result = fizzbuzz.play(input);
		String expectedResult = "Buzz";
		
		assertEquals(expectedResult, result);
	}
	
	@Test
	@DisplayName("Returns 'FizzBuzz' when input number is a multiple 3 and 5")
	void returnFizzBuzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = 15;
		String result = fizzbuzz.play(input);
		String expectedResult = "FizzBuzz";
		
		assertEquals(expectedResult, result);
	}

}
