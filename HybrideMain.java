// Interface 1
interface Engine {
    void engineType();
}

// Interface 2
interface Electric {
    void batteryCapacity();
}

// Parent class
class Vehicle {
    void wheels() {
        System.out.println("This vehicle has 4 wheels.");
    }
}

// Child class with hybrid inheritance
class ElectricCar extends Vehicle implements Engine, Electric {
    public void engineType() {
        System.out.println("Engine: Electric Motor");
    }

    public void batteryCapacity() {
        System.out.println("Battery: 75 kWh");
    }

    void model() {
        System.out.println("Model: Tesla Model 3");
    }
}

// Another class inheriting Vehicle (hierarchical part)
class Bike extends Vehicle {
    void bikeType() {
        System.out.println("This is a petrol bike.");
    }
}

public class HybrideMain {
    public static void main(String[] args) {
        System.out.println("----- Electric Car Info -----");
        ElectricCar car = new ElectricCar();
        car.model();             // Specific method
        car.wheels();            // From Vehicle class
        car.engineType();        // From Engine interface
        car.batteryCapacity();   // From Electric interface

        System.out.println("\n----- Bike Info -----");
        Bike b = new Bike();
        b.wheels();              // From Vehicle
        b.bikeType();            // Specific to Bike
    }
}
