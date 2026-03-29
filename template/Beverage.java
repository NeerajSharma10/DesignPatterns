package template;

abstract class Beverage {

    // Template method (fixed flow)
    final void prepare() {
        boilWater();
        brew();      // variable
        pour();
        addCondiments(); // variable
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void brew();

    void pour() {
        System.out.println("Pouring into cup");
    }

    abstract void addCondiments();
}
