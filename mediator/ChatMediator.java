package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {

    private List<Colleague> colleagues = new ArrayList<>();


    @Override
    public void sendAll(String from, String msg) {
        for (Colleague colleague : colleagues) {
            if (!colleague.getName().equals(from)) { // ✅ skip sender
                colleague.receive(from, msg);
            }
        }
    }

    @Override
    public void sendTo(String from, String to, String msg) {
        for (Colleague colleague : colleagues) {
            if(colleague.getName().equals(to)) {
                colleague.receive(from, msg);
                System.out.println("Message sent to " + to);
            }
        }
    }


    @Override
    public void register(Colleague c) {
        colleagues.add(c);
    }

}
