abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Stop");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Implemented Abstract method");
    }

}

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via credit card");
    }
}

public class Abstraction {

    public static void main(String args[]) {
        Bike b = new Bike();
        b.start();
        b.stop();
    }
}