package CODSOFT;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	public static void main(String args[]) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		int randomNumber = random.nextInt(100) + 1;
		int guess = 0;
		int count = 0;

		System.out.println("-----------------------------------");
		System.out.println("You Got 10 Chance");

		while (count != 10 && guess != randomNumber) {
			System.out.println("-----------------------------------");
			System.out.print("Enter A Number Between 1 And 100: ");
			guess = sc.nextInt();
			count++;

			System.out.println("-----------------------------------");
			if (guess == randomNumber) {
				guess = randomNumber;
				System.out.println("You Guessed It Right! The Number Was: " + randomNumber);
			} else if (guess < randomNumber) {
				System.out.println("The Number Is Higher Than Your Guess.");
			} else if (guess > randomNumber) {
				System.out.println("The Number Is Lower Than Your Guess.");
			}
			System.out.println(count + " Chance Used");
		}
		System.out.println("---------------------------------------------------------");
		if (count == 10 && guess != randomNumber) {
			System.out.println("You Have Used All Your Attempts! The Number Was: " + randomNumber);
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("Thank You For Playing !!");
	}
}