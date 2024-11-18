package test2;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> stock;

    public Inventory() {
        this.stock = new HashMap<>();
    }

    // Add item to inventory
    public void addItem(String item, int quantity) {
        stock.put(item, quantity);
    }

    // Reduce stock when item is ordered
    public void updateStock(String item, int quantity) {
        if (stock.containsKey(item)) {
            stock.put(item, stock.get(item) - quantity);
        }
    }

    // Get the quantity of a specific item
    public int getItemStock(String item) {
        return stock.getOrDefault(item, 0);
    }

    // Check if the item is low in stock
    public boolean isLowStock(String item) {
        return stock.getOrDefault(item, 0) < 5;
    }
}

