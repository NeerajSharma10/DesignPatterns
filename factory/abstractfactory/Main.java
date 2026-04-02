package factory.abstractfactory;


public class Main {
    public static void main(String[] args) {
        EmployeeAbstractFactory employeeAbstractFactory = new AndroidDevFactory();

        Employee androidDev = EmployeeFactory.createEmployee(employeeAbstractFactory);

        System.out.println(androidDev.getSalary() + " " + androidDev.getName());
    }
}
