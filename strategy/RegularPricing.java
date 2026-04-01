package strategy;

class RegularPricing implements PricingStrategy {
    public double calculate(double price, int qty) {
        return price * qty;
    }
}

