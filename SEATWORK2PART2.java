public class Product {

    private String productName;
    private double price;
    private int quantity;

  
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return price * quantity;
    }

    public void displayProduct() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + getTotalAmount());
    }

    public static void main(String[] args) {

        Product product = new Product("Gaming Mouse", 1500.5, 3);

        product.displayProduct();
    }
}
