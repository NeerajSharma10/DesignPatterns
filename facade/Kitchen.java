package facade;

// ==================== COMPLEX SUBSYSTEM PART ====================

import java.util.List;

class Kitchen {
    public void preparePizza(String pizzaType, List<String> toppings) {
        System.out.println("Preparing: " + pizzaType);
        System.out.println("Toppings: " + toppings);
    }

    public void assignDeliveryPartner() {
        System.out.println("Assigning delivery partner");
    }
}

