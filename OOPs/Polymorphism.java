class Calculator {
    // Compile-time polymorphism

    int add(int a, int b){ return a + b;}
    double add(double a, double b){ return a + b;}
}

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    // Runtime polymorphism

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Polymorphism {

    public static void main(String args[]) {

    }
}