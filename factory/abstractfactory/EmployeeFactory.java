package factory.abstractfactory;

public class EmployeeFactory {
    public static Employee createEmployee(EmployeeAbstractFactory employeeAbstractFactory) {
        return employeeAbstractFactory.createEmployee();
    }
}
