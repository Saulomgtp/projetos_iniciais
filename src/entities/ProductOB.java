package entities;
public class ProductOB {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return "Product data: " + name + ", R$" + String.format("%.2f", price) + ", " + quantity + " units, Total: R$" + String.format("%.2f", totalValueInStock());
    }
}
