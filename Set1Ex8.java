import java.util.Scanner;

public class Set1Ex8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter price per square feet: ");
        double pricePerSquareFeet = console.nextDouble();
        double totalCost = 0.0;

        console.nextLine(); // Consume the newline character left in the buffer

        while (true) {
            System.out.print("Enter room dimensions (width x height): and type done when done: ");
            String input = console.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            String[] dimensions = input.split("x");
            if (dimensions.length != 2) {
                System.out.println("Invalid input. Please use 'width x height' format.");
                continue;
            }

            double width, height;
            try {
                width = Double.parseDouble(dimensions[0].trim());
                height = Double.parseDouble(dimensions[1].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid dimensions.");
                continue;
            }

            double area = width * height;
            totalCost += area * pricePerSquareFeet;
        }

        System.out.printf("Total cost: $%,.2f%n", totalCost);
    }
}
