package Katas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	@DisplayName("Print input number")
	void returnInput() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.play(n);
		String expectedResult = "2";
		assertEquals(expectedResult, result);
	}

}
