import javax.swing.JOptionPane;

public class GuessingPi {
	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {
		
		// 2. Make a String variable to hold the value of Pi.
		//    Get the first few digits from http://www.piday.org/million/.
		char zero = '3';
		String pi = "3.141592653589793238462643383279502884197169399375105821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094330572703657595919530921861173819326117931051185480744623799627495673518857527248";

		// 3. Print out the first 3 digits of Pi to the console.
		//    The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
		//    Run your program to see how this works.
		//System.out.print(pi.charAt(0));
		//System.out.print(pi.charAt(1));
		//System.out.print(pi.charAt(2));
		//System.out.print(pi.charAt(3));
		
		// 9. If you want to give the user more than one chance to guess,
		//    put a for loop around steps 4-8.
		for (int i = 0; i < pi.length(); i++) {
		
		// 4. Create a for loop that will step through each digit of pi (steps 5-8)
		//    NOTE: The number of digits in your string will be
		//       yourStringVariable.length()
		JOptionPane.showMessageDialog(null, pi);
		// (int i1 = 0; i1 < pi.length(); i1++) {
			//System.out.println(pi.charAt(i1));
		//}
		// 5. Ask the user for the NEXT digit of pi.
		String userinput = JOptionPane.showInputDialog("NOw, prInT oUt tHE neXt diGit oF pI. >:-)");
		// 6. Compare the user's input to the next digit of your pi variable 
		//    (look at step 3 for a clue).
		//    HINT: use charAt(0) to get 1st char of user input String 
		//System.out.println(pi.charAt(433));
		// 7. If they are correct, print out "correct".
		if (userinput.equals("9")) {
			JOptionPane.showMessageDialog(null, "CoRreCt!!!");
			break;
		}else {
			JOptionPane.showMessageDialog(null, "IncOrRecT! StaRt OvEr!");
		}
		// 8. If they are not, print out "incorrect" and tell them
		//    to start over. Use 'break;' to break out of the loop.
		}
	}
}