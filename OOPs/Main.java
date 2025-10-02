// Class and Objects 

class Car {

    static int TotalCars = 0;

    private String brand;
    private int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        TotalCars++;
    }

    public int totalCar() {
        return TotalCars;
    }

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }

    @Override
    public String toString() {
            return "Brand: Tesla, Speed: 120 km/hr";
    }
}

public class Main {

    public static void main(String args[]) {
        Car car1 = new Car("Tesla", 120);
        Car car2 = new Car("Tesla", 120);

        car1.drive();
        System.out.println(car1.toString());
        System.out.println(car1.totalCar());
    }
}