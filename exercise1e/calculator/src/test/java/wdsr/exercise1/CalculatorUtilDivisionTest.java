package wdsr.exercise1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import wdsr.exercise1.logic.Calculator;

public class CalculatorUtilDivisionTest {
	private Calculator calculator;
	private CalculatorUtil calcUtil;

	@Before
	public void init() {
		calculator = Mockito.mock(Calculator.class);
		calcUtil = new CalculatorUtil(calculator);
	}
	
	@Test
	public void test16dividedBy4() {
		
		doReturn(4).when(calculator).add(anyInt(), anyInt());
		
		String result = calcUtil.getDivisionText(16, 4);
		
		assertThat("16 / 4 = 4", is(result));
		
		verify(calculator).add(anyInt(), anyInt());
	}		

	@Test(expected=IllegalArgumentException.class)
	public void testDivisionByZero() {
		// given
		doThrow(new IllegalArgumentException()).when(calculator).divide(anyInt(), eq(0));

		// when
		String result = calcUtil.getDivisionText(3, 0);
		
		// then
		assertThat("5 / 0 = 0", is(result));
		// empty - exception expected
	}
}
