package fizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void shouldReturn1(){
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("1", fizzBuzz.fizz(1));
	}
	
	@Test
	public void whenFizzBuzzGets2TwoReturn2() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("2", fizzBuzz.fizz(2));
		
	}
}
