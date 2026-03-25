package memento;

public class Memento {
    private String state;
    Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

