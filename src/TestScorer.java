import javax.swing.JOptionPane;

public class TestScorer {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("Enter the score of your last programming test. The score must be between 0-100. Then, I will give you your equivalent letter grade. Don't lie, or else... I WILL KNOW!!!");
		double scoreint = Integer.parseInt(score);
		JOptionPane.showMessageDialog(null, "Loading...");
		if (scoreint <= 100 && scoreint >= 97) {
			JOptionPane.showMessageDialog(null, "You got an A+! Good Job, I guess :O");
		} else if (scoreint <= 96.9 && scoreint >= 93) {
			JOptionPane.showMessageDialog(null, "You got an A! Good Job, I guess :O");
		} else if (scoreint <= 92.9 && scoreint >= 90) {
			JOptionPane.showMessageDialog(null, "You got an A-! Good Job, I guess :O");
		} else if (scoreint <= 89.9 && scoreint >= 87) {
			JOptionPane.showMessageDialog(null, "You got an B+. Study harder... :o");
		} else if (scoreint <= 86.9 && scoreint >= 83) {
			JOptionPane.showMessageDialog(null, "You got an B. Study harder... :o");
		} else if (scoreint <= 82.9 && scoreint >= 80) {
			JOptionPane.showMessageDialog(null, "You got an B-. Study harder... :o");
		} else if (scoreint <= 79.9 && scoreint >= 77) {
			JOptionPane.showMessageDialog(null, "You got an C+. Wow, your really need to stop watching YouTube and study for your TESTS!!! :|");
		} else if (scoreint <= 76.9 && scoreint >= 73) {
			JOptionPane.showMessageDialog(null, "You got an C. Wow, your really need to stop watching YouTube and study for your TESTS!!! :|");
		} else if (scoreint <= 72.9 && scoreint >= 70) {
			JOptionPane.showMessageDialog(null, "You got an C-. Wow, your really need to stop watching YouTube and study for your TESTS!!! :|");
		} else if (scoreint <= 69.9 && scoreint >= 67) {
			JOptionPane.showMessageDialog(null, "You got an D+. STOP WATCHING TV AND EATING JUNK FOOD! YOU CAN'T LIVE YOUR LIFE LIKE THIS! STUDY!!! >:O");
		} else if (scoreint <= 66.9 && scoreint >= 63) {
			JOptionPane.showMessageDialog(null, "You got an D. STOP WATCHING TV AND EATING JUNK FOOD! YOU CAN'T LIVE YOUR LIFE LIKE THIS! STUDY!!! >:O");
		} else if (scoreint <= 62.9 && scoreint >= 60) {
			JOptionPane.showMessageDialog(null, "You got an D-. STOP WATCHING TV AND EATING JUNK FOOD! YOU CAN'T LIVE YOUR LIFE LIKE THIS! STUDY!!! >:O");
		} else if (scoreint <= 59.9 && scoreint >= 0) {
			JOptionPane.showMessageDialog(null, "You got an Z--------------. HONESTLY, YOU GOT SUCH A LOW SCORE THAT I DON'T EVEN HAVE A GRADE FOR YOU! WHAT HAVE YOU BEEN DOING ALL THIS TIME?!? STOP WATCHING TV AND EATING JUNK FOOD! YOU CAN'T LIVE YOUR LIFE LIKE THIS! STUDY!!! XO");
		} else {
			JOptionPane.showMessageDialog(null, "Error, Error, Error.");
		}






	}
}
