class Doctor {
    private String name;
    private int id;
    private String dept;

    // Fields specific to Consultant
    private double consultationFee;
    private int experience;

    // Fields specific to Resident
    private double stipend;

    // Fields specific to Visiting Doctor
    private double perVisitFee;
    private String availableDays;

    // Constructor for Consultant
    public Doctor(String name, int id, String dept, double consultationFee, int experience) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.consultationFee = consultationFee;
        this.experience = experience;
    }

    // Constructor for Resident
    public Doctor(String name, int id, String dept, double stipend) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.stipend = stipend;
    }

    // Constructor for Visiting Doctor
    public Doctor(String name, int id, String dept, double perVisitFee, String availableDays) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.perVisitFee = perVisitFee;
        this.availableDays = availableDays;
    }

    // Display details
    public void showDetails() {
        System.out.println("Doctor Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + dept);

        if (consultationFee > 0) {
            System.out.println("Consultant | Fee: Rs." + consultationFee + " | Experience: " + experience + " years");
        } else if (stipend > 0) {
            System.out.println("Resident | Stipend: Rs." + stipend);
        } else if (perVisitFee > 0) {
            System.out.println("Visiting Doctor | Per Visit Fee: Rs." + perVisitFee + " | Available Days: " + availableDays);
        }
        System.out.println("-----------------------------");
    }
}

public class Hospital13 {
    public static void main(String[] args) {
        // Create different doctors
        Doctor d1 = new Doctor("Dr. Rao", 101, "Cardiology", 1000, 15); // Consultant
        Doctor d2 = new Doctor("Dr. Meena", 102, "Pediatrics", 5000);   // Resident
        Doctor d3 = new Doctor("Dr. Sharma", 103, "Orthopedics", 2000, "Mon, Wed, Fri"); // Visiting

        // Display records
        d1.showDetails();
        d2.showDetails();
        d3.showDetails();
    }
}
