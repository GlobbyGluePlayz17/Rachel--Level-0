import javax.swing.JOptionPane;

public class MovieApproval {
	public static void main(String[] args) {
		String user = JOptionPane.showInputDialog("How old are you?");
		int userint = Integer.parseInt(user);
		if (userint <= 0) {
			JOptionPane.showMessageDialog(null, "Error, Error, Error, Error, Error...");
		}
		else if (userint >= 18) {
			JOptionPane.showMessageDialog(null, "YoU cAn wAtCh ALL DE MOVIES!!!");
		}
		else if (userint <= 17) {
			JOptionPane.showMessageDialog(null, "YOu mUst haVe a paRenT tO watCh thEm mOvieS... :P (YoU sUck!!!)");
		}
		
	}
}