package mediator;

public interface Mediator {

    void sendAll(String from, String msg);
    void sendTo(String from, String to, String msg);
    void register(Colleague c);

}
