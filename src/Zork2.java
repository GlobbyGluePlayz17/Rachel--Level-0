import java.util.Scanner;

public class Zork2 {
	public static void main(String[] args) {
		Scanner keyob = new Scanner(System.in);
		System.out.println("Welcome to Zork2!");
		System.out.println("Today you will go on a dangerous journey that might kill you, just saying. Please expect painful death and  exploding tortoises. Now, let's begin...");
		System.out.println("Copy the instructions in the text. *NO capital letter allowed!!!");
		System.out.println(
				"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println(
				"You are in a dense, dark, scary jungle alone with only a rock. You look around, and the only thing around is ... treeeees.  There is a path in front of you leading to, well, \n we don't know yet. Let's figure out! Go forward.");
		String input = keyob.nextLine();
		if (input.equals("go forward")) {
			System.out.println(
					"You start walking forward following the path. You find a chest. \n You open the chest and find a bottle of rasberry flavored organic kombucha. Drink it or leave it?");
			input = keyob.nextLine();
			if (input.equals("drink it")) {
				System.out.println("You take it out, drink it, and fall and die in a hole. THE END");
				System.exit(1);
			} else if (input.equals("leave it")) {
				System.out.println("Then suddenly, you hear a SUPPUUURRR (loud purr :)  You start running and encounter a fork in the path. Left or Right?");
				input = keyob.nextLine();
				if (input.equals("left")) {
					System.out.println("You run left cautiously then encouter a tiger. Fight it or run back?");
					input = keyob.nextLine();
					if (input.equals("run back")) {
						System.out.println(
								"You scream and sprint back the way you came, but the tiger catches up and \n pounces on you. You should know what happens next... THE END");
						System.exit(1);
					} else if (input.equals("fight it")) {
						System.out.println(
								"You throw the rock you have at the tiger as a distraction. As the tiger has its attention on the rock, \n you break a branch off a near by tree and try to fight the tiger with it. It grabs a hold of the stick \n throws it far, far away, and...You should know what happens next... THE END");
						System.exit(1);
					}
				} else if (input.equals("right")) {
					System.out.println("You go right and find another fork. Left, forward, or right?");
					input = keyob.nextLine();
					if (input.equals("left")) {
						System.out.println(
								"You run left and trip over a fallen tree. You break you right leg, and can't walk. \n You are left as weak prey. You meet your end by a snake. THE END");
						System.exit(1);
					} else if (input.equals("forward")) {
						System.out.println(
								"You run forward and fall in a hole that goes all the way to the center of the Earth. \n You fall for more than 10 days and starve. Then, after 2 hours, you burn to death. THE END");
						System.exit(1);
					} else if (input.equals("right")) {
						System.out.println("You go right and encouter another fork. Left or right?");
						input = keyob.nextLine();
						if (input.equals("left")) {
							System.out.println(
									"You go left and find a narrow path fenced with large redwood trees. Grown on them is a layer of poison ivy. \n Something then touches your back. AAAAAAAAAAAAAAAAH!!! You turn around and find a FedEx employee. \n You are speechless and let him pushes you further in the narrow path, and starts to chase you. \n You run while the poison ivy brushes against you skin. The path goes on forever and your skin starts to swell until \n you are too fat to fit in the narrow path. Then, you die. THE END");
							System.exit(1);
						} else if (input.equals("right")) {
							System.out.println(
									"You run right and keep running for what seems like forever. You think about running back, \n but then a voice in your head says that there is a treasure ahead. Suprisingly, you trust that voice and keep running. \n At the end of the path, you find a shiny, new jet containing food, water, and a million dollar bill. \n Hopefully, you know how to fly and pilot a plane/jet because it's your only way out. Do you know how to fly?");
							input = keyob.nextLine();
							if (input.equals("yes")) {
								System.out.println(
										"You gather all the stuff, put it in the plane, and fly out the horrible forest. You go back home and become Bill Gates. Yay!\n\n\n\n                                           10 years later...  \n\n\n\n You die in a car crash while driving your Rolls Royce. THE END");
								System.exit(1);
							} else if (input.equals("no")) {
								System.out.println(
										"You attempt to fly the plane because you desperately want to see your family again. You make it out of the mysterious, horrible forest and \n then, you crash into the ground at about 200mph. You die in the plane with a MILLION DOLLAR bill. \n What a waste. THE END * life skill: learn how to fly a plane.");
								System.exit(1);
							}
						}
					}
				}
			}
		}
	}
}
