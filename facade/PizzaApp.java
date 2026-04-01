package facade;

import java.util.Arrays;

// ==================== USAGE ====================
public class PizzaApp {
    public static void main(String[] args) {
        PizzaOrderFacade facade = new PizzaOrderFacade();

        // Client just calls one method instead of 10+ subsystem calls
        facade.placeOrder(
                "Margherita",
                Arrays.asList("Cheese", "Olives"),
                2,
                "1234-5678-9012-3456",
                "+919876543210",
                "customer@email.com"
        );

        // Without facade, client would need to do:
        // - Check inventory
        // - Calculate price
        // - Process payment
        // - Update inventory
        // - Prepare pizza
        // - Assign delivery
        // - Send SMS
        // - Send email
        // ... and handle errors!
    }
}
