package estd;
import org.junit.Assert;
import org.junit.Test;
public class MinMaxTest {
	@Test
	public void minimosmaximosTest() {
		MinMax minmax = new MinMax();
		int[] minimax = {5, 3, 4, 6, 7, 8, 10, 2, 1};
		int jresult = minmax.bigDiff(minimax);
		Assert.assertTrue(jresult == 4);
	 }
}
