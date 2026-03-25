package prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        User u1 = new User();
        u1.setName("John");
        u1.setAge(23);
        Address addr1 = new Address();
        addr1.setCity("San Francisco");
        addr1.setStreet("prototype.Main Street");

        u1.setAddress(addr1);

        User u2 = (User) u1.clone();

        System.out.println(u1.getAddress().equals(u2.getAddress()));


    }

}