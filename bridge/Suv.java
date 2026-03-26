package bridge;

public class Suv extends Car {
    public Suv(Engine engine) {
        super(engine);
    }

    @Override
    void drive() {
        engine.start();
        System.out.println("Suv driving");
    }

}
