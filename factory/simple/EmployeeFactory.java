package factory.simple;

public class EmployeeFactory {
    public static Employee getEmployee(String empType) {
        if("ANDROID".equalsIgnoreCase(empType)) {
            return new AndroidDeveloper();
        } else if("WEB".equalsIgnoreCase(empType)){
            return new WebDeveloper();
        }
        return null;
    }
}
