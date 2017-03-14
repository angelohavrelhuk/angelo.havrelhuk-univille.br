package estd;

import org.junit.Assert;
import org.junit.Test;

public class EvenTest {
	@Test
	public void countEvenTest() {
		Even even = new Even();
		int[] nums = {5, 3, 4, 6, 7, 8, 10, 12};
		int jresult = even.countEvens(nums);
		Assert.assertTrue(jresult == 5);
	 }
}
