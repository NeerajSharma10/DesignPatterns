package factory.abstractfactory;

public class WebDeveloper implements Employee{
    @Override
    public int getSalary() {
        return 1000;
    }

    @Override
    public String getName() {
        return "I AM WEB DEVELOPER";
    }
}
