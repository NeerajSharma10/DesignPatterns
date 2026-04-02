package factory.method;

class SMSNotification implements Notification {

    @Override
    public void send() {
        System.out.println("SMS sent");
    }
}
