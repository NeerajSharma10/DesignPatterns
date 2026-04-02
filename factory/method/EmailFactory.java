package factory.method;

class EmailFactory extends NotificationFactory {
    Notification createNotification() {
        return new EmailNotification();
    }
}
