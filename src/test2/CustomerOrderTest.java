package test2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerOrderTest {

	private CustomerOrder order;
    private Inventory inventory;

    @Before
    public void setUp() {
        order = new CustomerOrder();
        inventory = new Inventory();

        // Initialize the inventory with some items
        inventory.addItem("Pepperoni Pizza", 10);
        inventory.addItem("Cheese Pizza", 8);
        inventory.addItem("Garlic Bread", 15);
    }
    
    @Test
	public void testPlaceOrder() {
	    order.addItem("Pepperoni Pizza", 12.50);
	    order.addItem("Garlic Bread", 5.00);
	    assertEquals(2, order.getItems().size());
	    assertEquals(17.50, order.getTotalAmount(), 0.01);
	}


	// ToDo: Test paying for the order
	// Add an item to the order, pay using a method, and verify that the order is marked as paid.


	// ToDo: Test inventory update when an order is placed
	// Add an item to the order and reduce its stock. Verify that the inventory count is updated correctly.


	// ToDo: Test low stock alert
	// Reduce the stock of an item and verify that the system triggers a low stock alert when the quantity falls below the threshold.


	// ToDo: Test order status updates
	// Set the status of the order and verify that the status is updated correctly.


}
