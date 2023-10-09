package projeto003;

import java.util.Date;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Double subTotal() {
        return this.quantity * this.price;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return getProduct().getName() + ", $" + price + ", Quantity: "+ quantity + ", Subtotal: $" + subTotal();
    }
}
