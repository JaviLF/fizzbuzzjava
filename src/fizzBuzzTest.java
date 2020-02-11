import static org.junit.Assert.*;

import org.junit.Test;

public class fizzBuzzTest {

	@Test
	public void testForString() {
		fizzbuzz test= new fizzbuzz();
		String output = test.fizzBuzz(15);
		assertEquals("FizzBuzz", output);
	}
	
	@Test
	public void testForNumber() {
		fizzbuzz test= new fizzbuzz();
		String output = test.fizzBuzz(4);
		assertEquals("4", output);
	}
	
	@Test
	public void testForArray() {
		fizzbuzz test= new fizzbuzz();
		String output[] = test.fizzBuzzList(6);
		assertEquals("FizzBuzz", output[0]);
	}

}
