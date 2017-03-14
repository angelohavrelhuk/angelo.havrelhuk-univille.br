package estd;

import javax.swing.JOptionPane;

public class Even {
	public int countEvens(int[] nums) {
		// for (int i = 0; i < nums.length; i++) {
		// JOptionPane.showMessageDialog(null, nums [i]);
		// }
		int jcounter = 0;
		for (int jpair : nums) {
			if (jpair % 2 == 0) {
				// é par
				jcounter++;
				JOptionPane.showMessageDialog(null,jpair);
			}
			
		}
		return jcounter;
	
	}
}
