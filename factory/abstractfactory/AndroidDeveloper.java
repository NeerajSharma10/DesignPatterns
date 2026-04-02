package factory.abstractfactory;

public class AndroidDeveloper implements Employee{
    @Override
    public int getSalary() {
        return 2000;
    }

    @Override
    public String getName() {
        return "I am Android Developer";
    }
}
