package bridge;

public class Main {
    public static void main(String[] args) {
        Engine petrol = new Petrol();
        Engine diesel = new Diesel();
        Engine electric = new Electric();

        Car suv = new Suv(petrol);
        Car suv2 = new Suv(diesel);

        Car sedan = new Sedan(petrol);
        Car sedan2 = new Sedan(electric);

        suv.drive();
        sedan.drive();
        sedan2.drive();
        suv2.drive();


    }
}
