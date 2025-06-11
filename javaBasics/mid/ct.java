import java.util.Scanner;

class Triangle{
    int a,b,c;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isValid(){
        return  (a+c>b) ;
    }
    public int perimeter(){
        return a+b+c;
    }
    public double area(){
        double S = (a+b+c)/2;
    return Math.sqrt(S * (S-a)*(S-b)*(S-c));
    }

}


public class ct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangle a , b , c   (b is base value) : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Triangle triangle = new Triangle(a, b, c);
        
        if(triangle.isValid()){
            System.out.println("Perimeter : "+triangle.perimeter());
            System.out.println("Area : "+triangle.area());
        }else{
            System.out.println("valid triangle");
        }

        sc.close();
    }
}
