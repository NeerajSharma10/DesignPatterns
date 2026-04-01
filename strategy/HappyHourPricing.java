package strategy;

class HappyHourPricing implements PricingStrategy {
    public double calculate(double price, int qty) {
        return price * qty * 0.8;
    }
}

