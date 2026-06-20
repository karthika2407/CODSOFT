
import java.util.*;

class Numbergame {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int guess;
        int attempts = 0;

        int randomNumber = rand.nextInt(100) + 1;

        System.out.println("Number Guessing Game");

        System.out.println("Guess a number between 1 to 100");

        do {
            System.out.println("Enter your Guess:");
            guess = scan.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too Low..Try again!");
            } else if (guess > randomNumber) {
                System.out.println("Too High..Try again!");
            } else {
                System.out.println("Correct!The random number is: " + randomNumber);
                System.out.println("Number of attempts: " + attempts);
            }

        } while (guess != randomNumber);

    }

}
