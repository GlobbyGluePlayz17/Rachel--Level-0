import javax.swing.JOptionPane;

public class YearsAlive {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What year were you born?");
		int num = Integer.parseInt(answer);
		String answer2 = "";
		System.out.println("These are the years you were born...");
		for (int i = num; i < 2018; i++) {
			answer2 = answer2 + i + "\n";
			System.out.println(i);
		}
		JOptionPane.showMessageDialog(null, answer2);
		// System.out.println(answer2);
	}

}