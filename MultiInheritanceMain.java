class Vehicle {
    void type() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    void brand() {
        System.out.println("Brand is Maruti.");
    }
}

class Swift extends Car {
    void model() {
        System.out.println("Model is Swift Dzire.");
    }
}

public class MultiInheritanceMain {
    public static void main(String[] args) {
        Swift s = new Swift();
        s.type();   // From Vehicle
        s.brand();  // From Car
        s.model();  // From Swift
    }
}
