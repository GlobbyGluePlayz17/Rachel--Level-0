import javax.swing.JOptionPane;

public class Madlibs {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha infested river, then here's how to do it...");
		// Get the user to enter an adjective
		String adjective = JOptionPane.showInputDialog("Enter a adjective");
		// Get the user to enter a type of liquid
		String liquid = JOptionPane.showInputDialog("Enter a type of liquid found on Earth");
		// Get the user to enter a body part
		String body = JOptionPane.showInputDialog("Enter a body part of anything in the universe");
		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog("Enter a verb of your choice");
		// Get the user to enter a place
		String place = JOptionPane.showInputDialog("Type in a place somewhere in the universe");
		// Fit the user's words into this sentence, and save it in a String:
		JOptionPane.showMessageDialog(null, "Piranhas are more " + adjective + " during the day, so cross the river at night. Piranhas are attracted to fresh " + liquid + " and will most likely take a bite out of your "+ body + " if you " + verb + ". Whatever you do, if you have an open wound, try to find another way to getback to the " + place + ". Good luck!");		
		// Make a pop-up for the final story. You can use \n to go to the next line.

	}
}