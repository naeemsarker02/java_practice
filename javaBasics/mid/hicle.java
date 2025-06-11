public class hicle{
    hicle(){
    System.out.println("Vehicle is created.");
    }
    }
    class Bike extends hicle{
    Bike(){
    super(); //will invoke Parent class's constructor
    System.out.println("Bike is created.");
    }
    public static void main(String[] args){
    Bike b = new Bike();

    }
}