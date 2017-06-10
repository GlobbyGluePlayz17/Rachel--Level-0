 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
 
public class BirthdayRemindur {
 
	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "December 2nd";
		String dadsBirthday = "August 13th";
		String myBirthday = "April 8th";
		String dogsBirthday = "January 1, 0001";
		
		// 2. Find out which birthday the user wants and and store their response in a variable
		String userbday = JOptionPane.showInputDialog("What birthday do you want? Mom, Dad, or MEH? Wait, also DOGE...>_<");
		// 3. Print out what the user typed
		System.out.println(userbday);
		// 4. if user asked for "mom"
		if (userbday.equals("Mom")) {
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
		else if (userbday.equals("Dad")) {
			System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
		else if (userbday.equals("MEH")) {
			System.out.println(myBirthday);
		}	
		else if (userbday.equals("DOGE")) {
			System.out.println(dogsBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("Sorry, I don't remember that person's birthday! That person doesn't even exist! >_<");
		}
	} 
}