package facade;

// ==================== COMPLEX SUBSYSTEM PART ====================

class Payment {
    public boolean processPayment(double amount, String cardNo) {
        System.out.println("Processing payment: ₹" + amount);
        return true;
    }

    public void refund(double amount) {
        System.out.println("Refunding: ₹" + amount);
    }
}
