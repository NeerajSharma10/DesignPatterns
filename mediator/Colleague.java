package mediator;

public abstract class Colleague {
    private Mediator mediator;
    private String name;

    Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }

    public abstract void sendAll(String msg);
    public  abstract void sendTo(String to, String msg);
    public abstract void receive(String from, String msg);
}
