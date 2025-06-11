package shapes;
import operations.AreaCalculator;

public class Rectangle {
    double a;
    double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    AreaCalculator ac = new AreaCalculator();

    public void getArea(){
        System.out.println(ac.calculateArea(a,b));
    }
}
