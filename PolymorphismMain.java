class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running smoothly on the road");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running fast on the track");
    }
}

public class PolymorphismMain {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();
        v.run();  // Output: Car is running smoothly on the road

        v = new Bike();
        v.run();  // Output: Bike is running fast on the track
    }
}
