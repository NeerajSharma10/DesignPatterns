package factory.method;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new EmailFactory(); // decide at runtime
        Notification notification = factory.createNotification();
        notification.send();

        NotificationFactory smsFactory = new SMSFactory(); // decide at runtime
        Notification smsNotification = smsFactory.createNotification();
        smsNotification.send();
    }
}
