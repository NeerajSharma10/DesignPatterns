package strategy;

public class Main
{
    public static void main(String[] args) {
        Pizza pizza = new Margherita();
        pizza.setStrategy(new HappyHourPricing());
        System.out.println(pizza.getPrice(2));

        // STRATEGY (7 classes)          INHERITANCE (12 classes)
        //┌──────────┐ ┌──────────┐     ┌─────────────────────┐
        //│ Pizzas   │ │Strategies│     │ MargheritaRegular   │
        //│ N = 3    │ │ M = 4    │     │ MargheritaHappyHour │
        //├──────────┤ ├──────────┤     │ FarmhouseRegular    │
        //│Margherita│ │Regular   │     │ FarmhouseHappyHour  │
        //│Farmhouse │ │HappyHour │     │ PepperoniRegular    │
        //│Pepperoni │ │Festival  │     │ PepperoniHappyHour  │
        //│          │ │Loyalty   │     │ ... 6 more classes  │
        //└──────────┘ └──────────┘     └─────────────────────┘

    }
}
