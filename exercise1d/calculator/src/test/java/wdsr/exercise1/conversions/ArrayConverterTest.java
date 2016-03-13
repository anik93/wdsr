package wdsr.exercise1.conversions;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

import wdsr.exercise1.conversions.ArrayConverter;

public class ArrayConverterTest {

	private ArrayConverter arrayConverter;
	
	@Before
	public void setup(){
		arrayConverter = new ArrayConverter();
	}
	
	@Test
	public void convertToInts() {
		String[] args = {"1", "2", "3"};
		int[] values = arrayConverter.convertToInts(args);
		assertThat(values[0], instanceOf(Integer.class));
		assertThat(values[1], instanceOf(Integer.class));
		assertThat(values[2], instanceOf(Integer.class));
	}

}
