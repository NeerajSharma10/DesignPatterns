package proxy;

class EmployeeServiceProxy implements EmployeeService {

    private EmployeeServiceImpl service;
    private String role;

    public EmployeeServiceProxy(String role) {
        this.role = role;
        this.service = new EmployeeServiceImpl();
    }

    @Override
    public void createEmployee(String name) {

        if (role.equals("ADMIN")) {
            service.createEmployee(name); // allowed ✅
        } else {
            System.out.println("Access Denied ❌");
        }
    }
}
