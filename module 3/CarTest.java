class Car {
    String make, model;
    int year;
    void displayDetails() {
        System.out.println(year + " " + make + " " + model);
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car c = new Car();
        c.make = "Tesla"; c.model = "Model 3"; c.year = 2022;
        c.displayDetails();
    }
}