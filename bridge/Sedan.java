package bridge;

public class Sedan extends Car{
    public Sedan(Engine engine) {
        super(engine);
    }

    @Override
    void drive() {
        engine.start();
        System.out.println("Sedan drive");
    }
}
