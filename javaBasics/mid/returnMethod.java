public class returnMethod {//return tyype method
    static int returnedMethod(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = returnedMethod(5, 7);
        System.out.println(result);
}
}