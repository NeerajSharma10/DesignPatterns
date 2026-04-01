package strategy;

// ==================== STRATEGY INTERFACE ====================
interface PricingStrategy {
    double calculate(double price, int qty);
}