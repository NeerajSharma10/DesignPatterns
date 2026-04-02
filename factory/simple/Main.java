package factory.simple;

public class Main {
    public static void main(String[] args) {
//        Employee webDeveloper = new WebDeveloper();
//        Employee androidDeveloper = new AndroidDeveloper();
//        System.out.println(androidDeveloper.salary());
        // above is very tight coupled , client should not know how object can
        // created follow the below code

        Employee androidDeveloper = EmployeeFactory.getEmployee("ANDROID");

        System.out.println(androidDeveloper.salary());



    }
}
