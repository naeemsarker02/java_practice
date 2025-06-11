public class car{
    // Instance variables (belong to the object)
    String brand;
    int speed;


    // Constructor to initialize instance variables
    public car(String brand, int speed) {
        this.brand = brand;  // Using 'this' to refer to instance variable
        this.speed = speed;
    }
    // Method to display car details
    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
    public static void main(String[] args) {
        // Creating objects (each has its own instance variables)
        car car1 = new car("Toyota", 120);
        car car2 = new car("BMW", 180);
        // Displaying info
        car1.displayInfo();//calling method
        car2.displayInfo();
    }
}
