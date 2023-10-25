import java.util.Scanner;
import java.util.Random;

public class Set1Ex9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        Random random = new Random();
        // add the + 1 to make it 1-5 instead of 0-5
        int randomNumber = random.nextInt(5) + 1;

        System.out.println("guess a number between 1-5: ");
        int guess = console.nextInt();

        while (randomNumber != guess) {
            System.out.println("Try again...");
            guess = console.nextInt();
        }
        System.out.println("you guessed it !!");
    }
}
