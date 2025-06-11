class Vehicle{
    Vehicle(){
    System.out.println("Vehicle is created.");
    }
    }
    
    class Bike extends Vehicle{
    Bike(){
    System.out.println("Bike is created.");
    }
    public static void main(String[] args){
    Bike b = new Bike();
    }
    }