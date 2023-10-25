import java.util.Scanner;
public class Set1Ex2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int counter = 0;

        System.out.println("enter a string: ");
        String sentence = console.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isUpperCase(c)) {
                counter++;
            }
        }
        System.out.println("Number of uppercase: " + counter);
    }
}
