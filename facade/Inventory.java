package facade;

// ==================== COMPLEX SUBSYSTEM PART ====================

class Inventory {
    public boolean checkAvailability(String item, int qty) {
        System.out.println("Checking inventory for: " + item);
        return true;
    }

    public void reduceStock(String item, int qty) {
        System.out.println("Reducing stock: " + item + " x" + qty);
    }
}