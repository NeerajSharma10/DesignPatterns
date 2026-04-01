package facade;

// ==================== COMPLEX SUBSYSTEM PART ====================

class Notification {
    public void sendSMS(String phone, String message) {
        System.out.println("SMS to " + phone + ": " + message);
    }

    public void sendEmail(String email, String message) {
        System.out.println("Email to " + email + ": " + message);
    }
}
