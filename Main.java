
public class Main {
    public static void main(String[] args) {

        User u1 = new User();
        u1.setName("John");
        u1.setAge(23);

        User u2 = u1;
        u1.setAge(2);

        

    }

}