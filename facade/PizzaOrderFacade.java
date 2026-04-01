package facade;

import java.util.List;

// ==================== FACADE ====================
class PizzaOrderFacade {
    private Inventory inventory;
    private Payment payment;
    private Kitchen kitchen;
    private Notification notification;

    public PizzaOrderFacade() {
        this.inventory = new Inventory();
        this.payment = new Payment();
        this.kitchen = new Kitchen();
        this.notification = new Notification();
    }

    public void placeOrder(String pizzaType, List<String> toppings,
                           int qty, String cardNo, String phone, String email) {
        System.out.println("\n===== ORDER PLACEMENT START =====");

        // 1. Check inventory
        if (!inventory.checkAvailability(pizzaType, qty)) {
            System.out.println("Out of stock!");
            return;
        }

        // 2. Calculate price
        double price = calculatePrice(pizzaType, toppings, qty);

        // 3. Process payment
        if (!payment.processPayment(price, cardNo)) {
            System.out.println("Payment failed!");
            return;
        }

        // 4. Update inventory
        inventory.reduceStock(pizzaType, qty);

        // 5. Prepare pizza
        kitchen.preparePizza(pizzaType, toppings);

        // 6. Assign delivery
        kitchen.assignDeliveryPartner();

        // 7. Send notifications
        notification.sendSMS(phone, "Order confirmed! Total: ₹" + price);
        notification.sendEmail(email, "Your order is being prepared");

        System.out.println("===== ORDER PLACEMENT END =====\n");
    }

    private double calculatePrice(String pizzaType, List<String> toppings, int qty) {
        double price = pizzaType.equals("Margherita") ? 200 : 250;
        price += toppings.size() * 50;
        return price * qty;
    }
}