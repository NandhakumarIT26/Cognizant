import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = new Random().nextInt(100) + 1, guess;
        do {
            System.out.print("Guess a number (1-100): ");
            guess = sc.nextInt();
            if (guess < number) System.out.println("Too low! Try again.");
            else if (guess > number) System.out.println("Too high! Try again.");
        } while (guess != number);
        System.out.println("🎉 You guessed it right!");
    }
}