import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    private static final int MAX_ATTEMPTS = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;
        int roundsWon = 0;

        do {
            playAgain = false;
            int targetNumber = generateRandomNumber(1, 100);
            boolean guessedCorrectly = playRound(scanner, targetNumber);
            
            if (guessedCorrectly) {
                roundsWon++;
                System.out.println("Congratulations! You've guessed the correct number.");
            } else {
                System.out.println("You've run out of attempts. The correct number was " + targetNumber);
            }

            System.out.println("Your current score is: " + roundsWon + " rounds won.");
            System.out.println("Do you want to play again? (yes/no)");
            String response = scanner.next();

            if (response.equalsIgnoreCase("yes")) {
                playAgain = true;
            }

        } while (playAgain);

        System.out.println("Thank you for playing! Your final score is: " + roundsWon + " rounds won.");
        scanner.close();
    }

    private static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    private static boolean playRound(Scanner scanner, int targetNumber) {
        for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
            System.out.println("Attempt " + attempt + ": Enter your guess (1-100):");
            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                return true;
            } else if (userGuess < targetNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }
        return false;
    }
}
