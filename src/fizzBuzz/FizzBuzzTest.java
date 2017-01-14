package fizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {


		FizzBuzz fizzBuzz = new FizzBuzz();

	
	@Test
	public void shouldReturn1(){
		assertEquals("1", fizzBuzz.fizz(1));
	}
	
	@Test
	public void whenFizzBuzzIsGiven2TwoReturn2() {
		assertEquals("2", fizzBuzz.fizz(2));
	}
	
	@Test
	public void whenFizzBuzzIsGiven3ReturnFizz() {
		assertEquals("F", fizzBuzz.fizz(3));
		assertEquals("F", fizzBuzz.fizz(6));
	}
	
	@Test
	public void whenFizzBuzzIsGiven5ReturnBuzz() {
		assertEquals("B", fizzBuzz.fizz(5));
	}
	
	@Test
	public void whenFizzBuzzIsGiven15ReturnFizzBuzz(){
		assertEquals("FB", fizzBuzz.fizz(15));
	}
}
