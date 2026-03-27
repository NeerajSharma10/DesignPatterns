package proxy;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void createEmployee(String name) {
        System.out.println("Employee created: " + name);
    }
}
