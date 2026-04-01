package decorator;

public class Main {
    public static void main(String[] args) {

        BasePizza complexPizza = new Mushroom(new ExtraCheese(new Farmhouse()));

        System.out.println(complexPizza.cost());


    }
}
