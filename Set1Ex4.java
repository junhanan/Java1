import java.util.Scanner;
public class Set1Ex4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String reversed = "";
        boolean test = true;
        System.out.println("palindrome checker: ");
        String word = console.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            // adds the character in front of the string
            // the ch is in front of reversed
            reversed = ch + reversed;
            for (int j = 0; j < reversed.length(); j++) {
                if (reversed.charAt(j) == word.charAt(i)) {
                    test = true;
                } else {
                    test = false;
                }
            }
        }
        System.out.println("palindrome?: " + test); 
    }
}
