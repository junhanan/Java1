import java.util.Scanner;
public class Set1Ex1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = console.nextLine();

        String upper = name.toUpperCase();

        System.out.println("Your name in upper case is: " + upper);
    }
}
