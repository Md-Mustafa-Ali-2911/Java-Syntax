class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog braks");
    }
}

public class Inheritance {

    public static void main(String args[]) {
        Animal d = new Dog();
        Dog s = new Dog();
        s.sound();
        d.sound();
    }
}