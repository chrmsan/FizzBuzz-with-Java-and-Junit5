package Katas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


class FizzBuzzTest {

	@Test
	@DisplayName("Print input number")
	void returnInput() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = 2;
		String result = fizzbuzz.play(input);
		String expectedResult = "2";
		
		assertEquals(expectedResult, result);
	}

}
