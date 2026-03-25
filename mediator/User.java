package mediator;

public class User extends Colleague {
    User(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendAll(String msg) {
        this.getMediator().sendAll(this.getName(), msg);
    }

    @Override
    public void sendTo(String to, String msg) {
        this.getMediator().sendTo(this.getName(), to, msg);
    }

    @Override
    public void receive(String from, String msg) {
        System.out.println(from + ": " + msg);
    }
}
