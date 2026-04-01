package strategy;

class Margherita implements Pizza {
    private PricingStrategy strategy;
    private double basePrice = 200;

    public void setStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public double getPrice(int qty) {
        return strategy.calculate(basePrice, qty);
    }
}
