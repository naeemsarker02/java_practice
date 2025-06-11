import java.util.Scanner;
class Student {
    String name;
    int mark;

    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    String greadd(){
        if(mark >= 90 && mark <= 100){
            return "A";
        }else if(mark >= 80 && mark <= 89){
            return "B";
        }else if(mark >= 70 && mark <= 79){
            return "C";
        }else if(mark >= 60 && mark <= 69){
            return "D";
        }else{
            return "F";
        }
    }
    void display(){
        System.out.println("Name: "+name+"grade : "+greadd());  
        }

}

public class studentManagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("no of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
        System.out.print("enter your name : ");
        String name = sc.nextLine();

        System.out.print("enter your mark : ");
        int mark = sc.nextInt();
            sc.nextLine();

        students[i] = new Student(name, mark);
        }

        System.out.println("students details ");
        System.out.println("------------------");
        for(Student S : students){
            S.display();
            }
        sc.close();
    }
}
