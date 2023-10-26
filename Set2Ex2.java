import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Set2Ex2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Peter Jones");
        hashMap.put(2, "John Smith");
        hashMap.put(3, "Mary Jane");

        Scanner console = new Scanner(System.in);
        System.out.print("Enter id: ");
        int input = console.nextInt();

        String name = hashMap.get(input);
        
        System.out.println("id= " + input);
        System.out.println("name= " + name);
        

    }
}