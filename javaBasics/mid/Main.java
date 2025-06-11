import java.util.Scanner;

class Employee {
    private int workingHours;
    private double basicWage;
    private double totalSales;

    // Constructor
    Employee(int workingHours, double basicWage, double totalSales) {
        this.workingHours = workingHours;
        this.basicWage = basicWage;
        this.totalSales = totalSales;
    }

    // Set Info method
    void setInfo(int workingHours, double basicWage, double totalSales) {
        this.workingHours = workingHours;
        this.basicWage = basicWage;
        this.totalSales = totalSales;
    }

    // Method to calculate and print total wage
    void printWage() {
        double commissionRate;

        if (totalSales <= 100) {
            commissionRate = 0.05;
        } else if (totalSales <= 300) {
            commissionRate = 0.10;
        } else {
            commissionRate = 0.15;
        }

        double totalWage = (commissionRate * totalSales) + (workingHours * basicWage);
        System.out.println("Total Wage: $" + totalWage);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.print("Enter working hours: ");
            int hours = sc.nextInt();

            System.out.print("Enter basic wage: ");
            double wage = sc.nextDouble();

            System.out.print("Enter total sales: ");
            double sales = sc.nextDouble();

            employees[i] = new Employee(hours, wage, sales); // you can also use setInfo() if needed
        }

        System.out.println("\n--- Employee Wages ---");
        for (Employee emp : employees) {
            emp.printWage();
        }

        sc.close();
    }
}
