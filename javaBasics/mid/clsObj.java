public class clsObj {
    String color = "black";
    int year = 1990;

    public static void main(String[] args) {
        clsObj Audi = new clsObj();
        clsObj BMW = new clsObj();


        System.out.println("Audi -> " +Audi.color);
        System.out.println("BMW -> " +BMW.color);
        System.out.println("BMW -> " +BMW.year);

    }
}
