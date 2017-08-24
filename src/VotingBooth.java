import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		int Who = 0;
		int Which = 0;
		int Whatsit = 0;
		for (int i = 0; i < 10; i++) {
			String vote = JOptionPane.showInputDialog("Who would you like to vote for Queen of the Earth? Mrs. WhO, Mrs. Which, or Mrs. Whatsit. Choose wisely... :D");
			if (vote.equals("Mrs. WhO")) {
				Who++;
			} else if (vote.equals("Mrs. Which")) {
				Which++;
			} else if (vote.equals("Mrs. Whatsit")) {
				Whatsit++;
			} else {
				JOptionPane.showMessageDialog(null, "Error, Error, Error. IT does not understand your input... Therefore, your vote does not count.");
				break;
			}
		}
			if (Who > Which && Who > Whatsit) {
				JOptionPane.showMessageDialog(null, "Mrs. WhO wins! She is now Queen of the Earth and will rule with the magic of her glasses!!!");
			} else if (Which > Who && Which > Whatsit) {
				JOptionPane.showMessageDialog(null, "Mrs. Which wins! She is now Queen of the Earth and will rule with power!!!");
			} else if (Whatsit > Who && Whatsit > Which) {
				JOptionPane.showMessageDialog(null, "Mrs. Whatsit wins! She is now Queen of the Earth and will rule with power!!!");
			} else if (Who == Which){
				JOptionPane.showMessageDialog(null, "Mrs. Who and Mrs. Which both win! Now we will... \n\n\n\n\n I don't know.");
			} else if (Who == Whatsit) {
				JOptionPane.showMessageDialog(null, "Mrs. Who and Mrs. Whatsit both win! Now we will... \n\n\n\n\n I don't know.");
			} else if (Which == Whatsit){
				JOptionPane.showMessageDialog(null, "Mrs. Which and Mrs. Whatsit both win! Now we will... \n\n\n\n\n I don't know.");
			} 
	}
}