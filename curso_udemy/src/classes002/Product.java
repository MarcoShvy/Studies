package classes002;

public class Product {

    private String name;
    private double price;
    private int quantidade;


//    public Product (String name, double price, int quantidade) {
//        this.name = name;
//        this.price = price;
//        this.quantidade = quantidade;
//    }

    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double totalValueInStock() {
        return price * quantidade;
    }

    public void addProducts(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProducts(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return name + ", $ "+ String.format("%.2f", price) + ", "+quantidade+" unidades, Total: $ "+ String.format("%.2f", totalValueInStock());
    }
}
