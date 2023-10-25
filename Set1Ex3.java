import java.util.Scanner;

public class Set1Ex3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("enter a string: ");
        String sentence = console.nextLine();

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                words[i] = words[i].toUpperCase();
            }
        }

        String result = String.join(" ", words);
        System.out.println(result);

    }
}
