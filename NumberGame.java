package CODSOFT;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static int menu(Scanner sc) {
		System.out.println("-----------------------------------");
		System.out.println("1. Play Another Game");
		System.out.println("2. Exit");
		System.out.print("Enter your choice: ");
		return sc.nextInt();
	}

	public static void main(String args[]) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int won = 0;
		int games = 0;
		int choice = 1;
		try {
			do {
				switch (choice) {
				case 1:
					games++;
					int randomNumber = random.nextInt(100) + 1;
					int guess = 0;
					int count = 0;

					System.out.println("-----------------------------------");
					System.out.println("You Got 10 Chance To Guess Correct Number");

					while (count != 10 && guess != randomNumber) {
						System.out.println("-----------------------------------");
						System.out.print("Enter A Number Between 1 And 100: ");
						guess = sc.nextInt();
						count++;

						System.out.println("-----------------------------------");
						if (guess == randomNumber) {
							guess = randomNumber;
							won++;
							System.out.println("You Guessed It Right! The Number Was: " + randomNumber);
						} else if (guess < randomNumber) {
							System.out.println("The Number Is Higher Than Your Guess.");
						} else if (guess > randomNumber) {
							System.out.println("The Number Is Lower Than Your Guess.");
						}
						System.out.println(count + " Chance Used");
					}
					if (count == 10 && guess != randomNumber) {
						System.out.println("You Have Used All Your Attempts! The Number Was: " + randomNumber);
					}
					System.out.println("Thank You For Playing !!");
					break;
				default:
					System.out.println("Enter Correct Choice !!!");
					break;
				}
			} while ((choice = menu(sc)) != 2);
		} catch (InputMismatchException e) {
			games--;
			System.out.println("-----------------------------------");
			System.out.println("Input Can Only Be Numbers !! Try Again");
			System.out.println("This Game Will Not Be Counted !!");
		}

		System.out.println("-----------------------------------");
		System.out.println("You Have Won " + won + " Out Of " + games + " Games");
		System.out.println("Your Score Is " + (won * 10) + "/" + (games * 10));
		System.out.println("Exiting the game. Goodbye!");
	}
}