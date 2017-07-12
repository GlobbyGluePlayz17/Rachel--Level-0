public class FizzBuzz {
	public static void main(String[] args) {
		for (int lkjhgfdsa = 0; lkjhgfdsa < 21; lkjhgfdsa++) {
			System.out.println(lkjhgfdsa);
			if (lkjhgfdsa%3 == 0) {
				System.out.print("Fizz");
			}
			if (lkjhgfdsa%5 == 0) {
				System.out.print("Buzz");
			}
		}
	}
}

//Copyright Wintriss Technical Schools 2013
/**
* Fizz Buzz
* 
* In this project, we're going to build FizzBuzz. It's a children's game where
* you count from 1 to 20. Easy, right? Here's the catch: instead of saying
* numbers divisible by 3, say "Fizz". And instead of saying numbers divisible
* by 5, say "Buzz". For numbers divisible by both 3 and 5, say "FizzBuzz".
* 
* So the rules are:
* 		Any number divisible by 3 is replaced by the word fizz 
* 		Any number divisible by 5 is replaced by the word buzz. 
* 		Numbers divisible by both 3 and 5 become fizzbuzz.
* 
* Print your results to the console, or using JOptionPane if you like.
**/