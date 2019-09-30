package sumN;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumTest {

	@Test
	public void test() {
		SumOfN s=new SumOfN();
		int output=s.getSum(3);
		assertEquals(6,output);
		
	}

}
