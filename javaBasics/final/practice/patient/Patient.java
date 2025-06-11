package patient;

// Patient class to store patient information
public class Patient {
    // Private variables (not directly accessible from other classes)
    private int pid;
    private String pname;
    private String history;
    private String medicines;

    // Constructor with patient ID and name
    public Patient(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    // Constructor with ID, name, and history
    public Patient(int pid, String pname, String history) {
        this.pid = pid;
        this.pname = pname;
        this.history = history;
    }

    // Setter method to set history
    public void setHistory(String history) {
        this.history = history;
    }

    // Setter method to set medicines
    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    // Getter method to get patient ID
    public int getPid() {
        return pid;
    }

    // Getter method to get patient name
    public String getPname() {
        return pname;
    }

    // Getter method to get patient history
    public String getHistory() {
        return history;
    }

    // Getter method to get prescribed medicines
    public String getMedicines() {
        return medicines;
    }
}
