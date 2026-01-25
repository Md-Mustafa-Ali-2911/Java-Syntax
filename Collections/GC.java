

public class GC {

    public static void main(String args[]) {
        Phone phone = new Phone("Apple", "16 pro max");
        System.out.println(phone);
        phone = null; // phone object eligible for gc
        System.out.println(phone);
        // Garbage Collection is the JVM’s automatic process of finding and deleting objects that are no longer used to free memory.
        // You never delete objects manually in Java.
    
        System.gc(); // request
        // Objects become eligible, not instantly deleted.

        // WeakReference if not in use remove it
        // Used for caching etc

        WeakReference<Phone> phoneReference = new WeakReference<>(new Phone("Smasung", "16 pro max"));
        System.out.println(phoneReference.get());
        System.gc();

        try {
            Thraed.sleep(10000);
        } catch(Exception ignored) {

        }
        System.out.println(phoneReference.get());


    } 
}

class Phone {

    String brand;

    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            '}';
    }

}