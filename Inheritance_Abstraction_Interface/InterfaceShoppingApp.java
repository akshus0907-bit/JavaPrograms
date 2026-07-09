import java.util.Scanner;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Setters
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

interface Cart {
    void calculateTotal(CartItem c);
}

class ShoppingCart implements Cart {

    @Override
    public void calculateTotal(CartItem c) {
        double total = c.getPrice() * c.getQuantity();
        double gst = total * 0.18;
        double finalAmount = total + gst;

        System.out.println("Total : " + total);
        System.out.println("GST : " + gst);
        System.out.println("Final Amount : " + finalAmount);
    }
}

public class InterfaceShoppingApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CartItem c = new CartItem();

        System.out.print("Enter item: ");
        c.setItemName(sc.nextLine());

        System.out.print("Enter price: ");
        c.setPrice(sc.nextDouble());

        System.out.print("Enter quantity: ");
        c.setQuantity(sc.nextInt());

        ShoppingCart s = new ShoppingCart();
        s.calculateTotal(c);

        sc.close();
    }
}