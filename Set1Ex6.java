import java.util.Scanner;
public class Set1Ex6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("give me 1 int: ");
        int num1 = console.nextInt();

        System.out.println("give me the 2nd int: ");
        int num2 = console.nextInt();

        int result = num1 + num2;
        System.out.println("the result is: " + result);
    }
}
