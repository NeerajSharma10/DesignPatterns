package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.UserBuilder.builder().
                setId("121").
                setName("Neeraj").
                setEmail("zzzz.gmail.com")
                .build();

        System.out.println(user.getName());
    }
}
