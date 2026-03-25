package mediator;

public class Main {

    public static void main(String[] args) {
        Mediator chatMediator = new ChatMediator();
        Colleague user1 = new User(chatMediator, "Ram");
        Colleague user2 = new User(chatMediator, "Shyam");
        Colleague user3 = new User(chatMediator, "Jonita");

        chatMediator.register(user1);
        chatMediator.register(user2);
        chatMediator.register(user3);

        user1.sendAll("I love all");
        user2.sendTo("Jonita", "I love you");




    }

}
