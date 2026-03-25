package prototype;

public class User implements Cloneable {
    private String name;
    private int age;
    private Address address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Step 1: Shallow copy the prototype.User (copies name and age)
        User clonedUser = (User) super.clone();

        // Step 2: Deep copy the prototype.Address (creates a NEW prototype.Address object)
        if (this.address != null) {
            clonedUser.address = (Address) this.address.clone();
        }

        return clonedUser;
    }
}
