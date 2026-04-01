package strategy;

interface Pizza {
    void setStrategy(PricingStrategy strategy);
    double getPrice(int qty);
}