package wdsr.exercise1.logic;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

import sun.invoke.empty.Empty;

public class CalculatorTest {
	private Calculator calculator;

	@Before
	public void setup() {
		calculator = new Calculator();
	}
	
	@Test
	public void testMin_shouldReturnTheOnlyValue() {
		// given
		int[] values = { -5 };
		
		// when
		int min = calculator.min(values);
		
		// then
		//assertEquals(values[0], min);
		assertThat(values[0], is(min));
	}
	
	@Test
	public void testMin_shouldReturnTheSmallestOfAllValues() {
		// given
		int[] values = { 2, -3, 5 };
		
		// when
		int min = calculator.min(values);
		
		// then
		//assertEquals(-3, min);
		assertThat(-3, is(min));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForNullArgument() {
		// given
		int[] values = null;
		
		// when
		calculator.min(values);
		
		// then
		assertThat(values, is(nullValue()));
		// empty
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForEmptyArgument() {
		// given
		int[] values = {};
		
		// when
		calculator.min(values);
		
		// then
		assertThat(values.length, is(0));
		// empty
	}
	
	@Test
	public void testMax_shouldReturnTheOnlyValue() {
		// given
		int[] values = { -5 };
		
		// when
		int max = calculator.max(values);
		
		// then
		//assertEquals(values[0], min);
		assertThat(values[0], is(max));
	}
	
	@Test
	public void testMax_shouldReturnTheSmallestOfAllValues() {
		// given
		int[] values = { 2, -3, 5 };
		
		// when
		int max = calculator.max(values);
		
		// then
		//assertEquals(-3, min);
		assertThat(5, is(max));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMax_shouldRaiseAnExceptionForNullArgument() {
		// given
		int[] values = null;
		
		// when
		calculator.max(values);
		
		// then
		assertThat(values, is(nullValue()));
		// empty
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMax_shouldRaiseAnExceptionForEmptyArgument() {
		// given
		int[] values = {};
		
		// when
		calculator.max(values);
		
		// then
		assertThat(values.length, is(0));
		// empty
	}
}
