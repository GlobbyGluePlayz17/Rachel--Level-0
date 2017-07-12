import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		int counter = 0;
		String input = JOptionPane.showInputDialog("Enter a number above 2 and I will see if it is prime or not.");
		JOptionPane.showMessageDialog(null, "Please wait. We are calculating the answer...");
		int num = Integer.parseInt(input);
		for (int i = 1; i <= num; i++) {
			if (num%i == 0) {
				counter++;
			}
		}
		if (counter > 2) {
			JOptionPane.showMessageDialog(null, "The number you entered is composite, not prime.");
		}
		else if (counter == 2) {
			JOptionPane.showMessageDialog(null, "The number you entered is prime. (not)Yay!");
		}
		else if (counter != 0) {
			JOptionPane.showMessageDialog(null, "You did not enter a number above 2! READ THE DIRECTION NEXT TIME YOU DUMMY!");
		}
	}
}
