package BuisnessLogic;

/**
 * Created by borisgrunwald on 23/08/2016.
 */
public class GroceryItemOrder {

    private String name;
    private int quantity;
    private double price;

    public GroceryItemOrder(String name) {
        this.name = name;
        this.quantity = 1;
    }

    public GroceryItemOrder(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return price*quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " + name + "\n" +
                "Quantity: " + quantity + "\n" +
                "Price: " + price;

    }
}
