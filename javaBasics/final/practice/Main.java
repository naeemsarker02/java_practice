import patient.Patient;  // Import the Patient class from 'patients' package
import java.util.Scanner; // For taking user input

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object for input

        // Ask user how many patients they want to add
        System.out.print("Enter number of patients: ");
        int n = sc.nextInt(); // Read the number
        sc.nextLine(); // Clear the newline from buffer

        // Create an array to store 'n' Patient objects
        Patient[] patients = new Patient[n];

        // Input details for each patient
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for patient " + (i + 1));
            
            // Get patient ID
            System.out.print("Patient ID: ");
            int pid = sc.nextInt();
            sc.nextLine(); // Clear newline

            // Get patient name
            System.out.print("Patient Name: ");
            String pname = sc.nextLine();

            // Get medical history
            System.out.print("Medical History: ");
            String history = sc.nextLine();

            // Get prescribed medicines
            System.out.print("Prescribed Medicines: ");
            String medicines = sc.nextLine();

            // Create a Patient object using constructor
            patients[i] = new Patient(pid, pname);

            // Set history and medicines using setter methods
            patients[i].setHistory(history);
            patients[i].setMedicines(medicines);
        }

        // Display all patients' information
        System.out.println("\nAll Patients' Prescribed Medicines:");
        for (Patient p : patients) {
            System.out.println("Patient ID: " + p.getPid());
            System.out.println("Name: " + p.getPname());
            System.out.println("History: " + p.getHistory());
            System.out.println("Medicines: " + p.getMedicines());
            System.out.println("------------------------------");
        }

        sc.close(); // Close scanner
    }
}
