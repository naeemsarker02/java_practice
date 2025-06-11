import java.util.Scanner;

class Student {
    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to determine grade
    String getGrade() {
        return (marks >= 90) ? "A" :
               (marks >= 80) ? "B" :
               (marks >= 70) ? "C" :
               (marks >= 60) ? "D" : "F";
    }

    // Method to display details
    void showInfo() {
        System.out.println(name + " - Marks: " + marks + ", Grade: " + getGrade());
    }
}

public class StudentManagementt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine(); // Consume newline

            students[i] = new Student(name, marks); // Creating object
        }

        System.out.println("\nStudent Details:");
        for (Student s : students) {
            s.showInfo();
        }

        sc.close();
    }
}
