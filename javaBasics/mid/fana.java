class Vehicle {
    // Parent class constructor
    Vehicle() {
        System.out.println("Vehicle is created.");
    }
}

class Bike extends Vehicle {
    // Child class constructor
    Bike() {
        super(); // Calls the parent class (Vehicle) constructor
        System.out.println("Bike is created.");
    }
}

public class fana{
    public static void main(String[] args) {
        Bike b = new Bike(); // Creating an object of Bike
        b.Vehicle();
    }
}
