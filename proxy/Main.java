package proxy;

public class Main {
    public static void main(String[] args) {
        EmployeeService admin = new EmployeeServiceProxy("ADMIN");
        admin.createEmployee("John");

        EmployeeService user = new EmployeeServiceProxy("USER");
        user.createEmployee("Doe");
    }
}
