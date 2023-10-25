import java.util.Scanner;
public class Set1Ex5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int counter = 0;
        int consonateCounter = 0;

        System.out.println("give me a string: ");
        String word = console.nextLine();

        String lower = word.toLowerCase();

        for (int i = 0; i < lower.length(); i ++) {
            if (new String(vowels).indexOf(lower.charAt(i)) != -1) {
                counter++;
            } else {
                consonateCounter++;
            }
        }
        System.out.println("number of vowels: " + counter);
        System.out.println("number of consonate: " + consonateCounter);
    }
}
