import java.util.Random;

import javax.swing.JOptionPane;
 
// Copyright Wintriss Technical Schools 2013
public class HighLowGame {
 
	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(1000001);
		// 2. Print out the random variable above
		//System.out.println(random);
		// 11. do the following 10 times
			int guessint = 0;
		for (int i = 0; i < 20; i++) {
			// 1. ask the user for a guess using a pop-up window, and save their response 
			String guess = JOptionPane.showInputDialog("Guess a number between 1-1,000,000?(You only have 20 tries, muwahhahahahahaha!)");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			guessint = Integer.parseInt(guess); 
			// 5. if the guess is correct
				// 6. win
			if (guessint == random) {
				JOptionPane.showMessageDialog(null, "You guessed the number. I guess your not as dumb as I thought...");
				i=10;
			}
			// 7. if the guess is high
				// 8. tell them it's too high
			else if (guessint > random) {
				JOptionPane.showMessageDialog(null, "Too high. >_< Try again.");
			}
			// 9. if the guess is low
				// 10. tell them it's too low
			else if (guessint < random) {
				JOptionPane.showMessageDialog(null, "Too low. >_< Try again.");
			}
		}
		// 12. tell them they lose
		if (guessint == random) {
			JOptionPane.showMessageDialog(null, "You Won...>_<");
		}
		else{
			JOptionPane.showMessageDialog(null, "You LOST!!!!!!!!!!!");
		}
	}
}