import javax.swing.JOptionPane;

public class NameRepeater {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name.");
		String number = JOptionPane.showInputDialog("Enter a number.");
		int num = Integer.parseInt(number);
		for (int i = 0; i < num; i++) {
			System.out.println(name);
		}
	}
}
