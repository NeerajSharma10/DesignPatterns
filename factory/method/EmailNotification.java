package factory.method;

class EmailNotification implements Notification {
    public void send() {
        System.out.println("Email sent");
    }
}
