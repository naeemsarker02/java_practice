public class typeCasting {
    public static void main(String [] args){
        int myInt = 7;
        double myDouble = myInt; //auto casting int to double

        System.out.println("this is int "+ myInt); //7
        System.out.println("this is double "+ myDouble);//7.000
        
        float myFloat = 5.5f; 
        int myInt2 = (int) myFloat; // explicit & manual casting float to int
        System.out.println("this is float "+ myFloat);//5.5
        System.out.println("this is int "+ myInt2); //5
        

    }
}
