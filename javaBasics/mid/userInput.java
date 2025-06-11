import java.util.Scanner;

public class userInput {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String name;
        int age;

        System.out.print("enter your name : ");
        name = myObj.nextLine();

        System.out.print("enter your age : ");
        age = myObj.nextInt();

        System.out.println("hello "+name+" your age is "+age);

    }
}
