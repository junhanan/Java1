import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

class Base {
    protected int id;

    public Base(int id) {
        this.id = id;
    }
}

public class Invoice extends Base{
    private List<Product> products;

    public Invoice(int id) {
        super(id);
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    // retrieving the total cost
    // public double getTotalCost() {
    //     double totalCost = 0.0;
    //     for (int i = 0; i < products.size(); i++) {
    //         totalCost += products.get(i).getCost();
    //     }
    //     return totalCost;
    // }
    public double getTotalCost() {
        double totalCost = 0.0;
        for (Product product : products) {
            totalCost += product.getCost();
        }
        return totalCost;
    }

    public static void main(String[] args) {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }
}

class Product extends Base{
    private String name;
    private double cost;

    public Product(int id, String name, double cost) {
        super(id);
        this.name = name;
        this.cost = cost;
    }
    // retrieving the cost of 1 item
    public double getCost() {
        return cost;
    }
}
