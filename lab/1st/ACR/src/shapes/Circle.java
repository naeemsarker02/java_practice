package shapes;
import operations.AreaCalculator;

public class Circle {
    double r;

    public Circle(double r){
        this.r = r;
    }

    AreaCalculator ac = new AreaCalculator();

    public void getArea(){
        System.out.println(ac.calculateArea(r));
    }
}
