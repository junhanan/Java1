import java.util.Scanner;
public class Set1Ex7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("give me 1 int: ");
        int num1 = console.nextInt();

        System.out.println("give me the 2nd int: ");
        int num2 = console.nextInt();

        console.nextLine();

        System.out.println("choose one: add, sub, mul, div");
        String operator = console.nextLine();

        if (operator.equals("add")) {
            System.out.println(num1 + num2);
        } else if (operator.equals("sub")) {
            System.out.println(num1 - num2);
        } else if (operator.equals("mul")) {
            System.out.println(num1 * num2);
        } else if (operator.equals("div")) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("bruh you had 1 job pick the right option");
        }
        
    }
}