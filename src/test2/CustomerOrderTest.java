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


    @Test
	public void testPayOrder() {
	    order.addItem("Cheese Pizza", 10.00);
	    order.pay("Credit Card");
	    assertTrue(order.isPaid());
	    assertEquals(10.00, order.getTotalAmount(), 0.01);
	}


    @Test
	public void testInventoryUpdate() {
	    order.addItem("Pepperoni Pizza", 12.50);
	    inventory.updateStock("Pepperoni Pizza", 1);
	    assertEquals(9, inventory.getItemStock("Pepperoni Pizza"));
	}

	@Test
	public void testLowStockAlert() {
	    inventory.updateStock("Garlic Bread", 13);  // Only 2 left after this
	    assertTrue(inventory.isLowStock("Garlic Bread"));
	}

	// ToDo: Test order status updates
	// Set the status of the order and verify that the status is updated correctly.


}
