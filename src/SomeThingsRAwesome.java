import javax.swing.JOptionPane;

public class SomeThingsRAwesome {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Type in something you like...:|");
		String awesome = " is awesome!";
		System.out.println(input + awesome);
		System.out.println("Wait for it...");
		System.out.println(input + " is not awesome...:)");
	}
}