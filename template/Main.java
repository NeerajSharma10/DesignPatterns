package template;

public class Main {
    public static void main(String[] args) {

        Beverage tea = new Tea();
        tea.prepare();

        System.out.println("----");

        Beverage coffee = new Coffee();
        coffee.prepare();
    }
}
