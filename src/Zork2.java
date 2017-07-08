import java.util.Scanner;

public class Zork2 {
	public static void main(String [] args){
		Scanner keyob = new Scanner(System.in);
		System.out.println("Welcome to Zork2!");
		System.out.println("Today you will go on a dangerous journey that might kill you, just saying. Please expect painful death and  exploding tortoises. Now, let's begin...");
		System.out.println("Use verbs as command for this dangerour journey. Ex: if you want to eat type 'eat'. *NO capital letter allowed!!!");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("You are in a dense, dark, scary jungle alone with only a rock. You look around, and the only thing around is ... treeeees.  There is a path in front of you leading to, well, \n we don't know yet. Let's figure out! And, there is a path behind you leading to,  well, we don't know yet too. Let's figure out! Go forward or go backward?");
		String input = keyob.nextLine();
		if (input.equals("go forward")){
			System.out.println("You start walking forward following the path. Then suddenly, you hear a \n SUPPUUURRR (loud purr :). You start running and encounter a fork in the path. Left or Right?");
		} else if (input.equals("go backward")) {
		System.out.println("You start walking and you follow the path far away from the place you started and you find a chest. \n You open the chest and find a bottle of rasberry flavored organic kombucha. Drink it or go back to the starting area?");
		input = keyob.nextLine();
		if (input.equals("drink it")){
			System.out.println("You take it out, drink it, and fall and die in a hole. THE END");
			System.exit(1);
		}else if (input.equals("go back to starting area")){
			System.out.println("You scream and run back to the starting area. You start walking forward following the path. Then suddenly, you hear a supuuuurrr (loud purr :). \n You start running and encounter a fork in the path. Left or Right?");
		    }
		}
	}
}
