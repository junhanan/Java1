import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Person {
    private int id;
    private String firstName;
    private String lastName;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString() {
        return "Person{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "'}";
    }
}

public class Set2Ex1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<Person> peopleList = new ArrayList<>();
        int id = 1;

        while (true) {
            System.out.print("Enter id, firstName, lastName with commas or type done: ");
            String input = console.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            String[] data = input.split(", ");
            if (data.length != 3) {
                System.out.println("invalid input do it again");
                continue;
            }
            
            int personId = Integer.parseInt(data[0]);
            String firstName = data[1];
            String lastName = data[2];
            peopleList.add(new Person(personId, firstName, lastName));
            id++;
        }
        for (int i = 0; i < peopleList.size(); i++) {
        Person person = peopleList.get(i);
        System.out.println(person);
        }
    }
}
