package factory.method;

class SMSFactory extends NotificationFactory {

    @Override
    Notification createNotification() {
        return new SMSNotification();
    }
}
