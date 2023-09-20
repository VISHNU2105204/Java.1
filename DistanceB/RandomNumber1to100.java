/*Practical13 : Write a program should generate a random number between 1 and 100,
and then ask the user to guess the number. If the user’s guess is too high or too low,
the program should give them a hint and let them try again. The program should
keep track of how many guesses the user has made, and end when the user has
guessed the number correctly*/
 
import java.util.Random;
import java.util.Scanner;

public class Practical13 {

	public static void main(String[] args) {

		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		
		Scanner sc = new Scanner(System.in);
		
		int guessTheNumber = 0;
		System.out.println("Welcome to the Number Guessing Game!");
		
		while (true) {
			System.out.print("Guess the number (between 1 and 100): ");
			int userGuess = sc.nextInt();
		
			guessTheNumber++;
			
			if (userGuess == randomNumber) {
			
				System.out.println("Congratulations! You've guessed"
						+ "the number " + randomNumber + " in "+ guessTheNumber +" guesses.");
				break;
				}
			else if (userGuess < randomNumber) {
				
				System.out.println("Too low. Try again.");
				}
			else {
				
				System.out.println("Too high. Try again.");
				}
			}
		}
	}
