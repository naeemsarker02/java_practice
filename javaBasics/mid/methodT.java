public class methodT {
    String brand;
    int speed;

    static void drive() {
        System.out.println("Car is driving");
    }

    public static void main(String[] args) {
        methodT myCar = new methodT(); // Create an object
        myCar.brand = "Toyota";
        myCar.speed = 120;
        myCar.drive();//callig method

        System.out.println("Brand: " + myCar.brand);
        System.out.println("Speed: " + myCar.speed + " km/h");
    }
}
