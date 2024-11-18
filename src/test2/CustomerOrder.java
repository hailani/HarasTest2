package test2;

import java.util.ArrayList;
import java.util.List;

public class CustomerOrder {
    private List<String> items;
    private double totalAmount;
    private boolean paid;
    private String paymentMethod;  // "Credit Card", "PayPal", or "Cash"
    private String status;  // "Placed", "In Kitchen", "Ready", "On the Way", "Delivered"
    
    public CustomerOrder() {
        this.items = new ArrayList<>();
        this.totalAmount = 0.0;
        this.paid = false;
        this.status = "Placed";
    }

    // Add item to order
    public void addItem(String item, double price) {
        items.add(item);
        totalAmount += price;
    }

    // Get total amount
    public double getTotalAmount() {
        return totalAmount;
    }

    // Pay for the order
    public void pay(String method) {
        this.paid = true;
        this.paymentMethod = method;
    }

    // Get order status
    public String getStatus() {
        return status;
    }

    // Set order status
    public void setStatus(String status) {
        this.status = status;
    }

    // Check if order is paid
    public boolean isPaid() {
        return paid;
    }

    // Get items in the order
    public List<String> getItems() {
        return items;
    }
}
