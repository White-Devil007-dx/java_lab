import java.util.*;

// Abstract parent class
abstract class Appointment {
    private String doctorName;
    private String date;

    public Appointment(String doctorName, String date) {
        this.doctorName = doctorName;
        this.date = date;
    }

    public String getDoctorName() { return doctorName; }
    public String getDate() { return date; }

    // Abstract methods
    public abstract void schedule();
    public abstract void cancel();
}

// Subclass: EmergencyAppointment
class EmergencyAppointment extends Appointment {
    public EmergencyAppointment(String doctorName, String date) {
        super(doctorName, date);
    }

    @Override
    public void schedule() {
        System.out.println("Emergency appointment scheduled with Dr. " + getDoctorName() + " on " + getDate());
    }

    @Override
    public void cancel() {
        System.out.println("Emergency appointment with Dr. " + getDoctorName() + " on " + getDate() + " has been cancelled.");
    }
}

// Subclass: RegularAppointment
class RegularAppointment extends Appointment {
    public RegularAppointment(String doctorName, String date) {
        super(doctorName, date);
    }

    @Override
    public void schedule() {
        System.out.println("Regular appointment scheduled with Dr. " + getDoctorName() + " on " + getDate());
    }

    @Override
    public void cancel() {
        System.out.println("Regular appointment with Dr. " + getDoctorName() + " on " + getDate() + " has been cancelled.");
    }
}

// Patient class with 1-to-many association
class Patient {
    private String name;
    private ArrayList<Appointment> appointments;

    public Patient(String name) {
        this.name = name;
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment a) {
        appointments.add(a);
    }

    public void showAppointments() {
        System.out.println("\nAppointments for patient: " + name);
        for (Appointment a : appointments) {
            a.schedule(); // Polymorphic call
        }
    }
}

// Main class
public class Hospital11 {
    public static void main(String[] args) {
        Patient p1 = new Patient("Chakri");

        // Add different types of appointments
        p1.addAppointment(new EmergencyAppointment("Rao", "07-Oct-2026"));
        p1.addAppointment(new RegularAppointment("Sharma", "10-Oct-2026"));
        p1.addAppointment(new RegularAppointment("Kumar", "15-Oct-2026"));

        // Display appointments
        p1.showAppointments();
    }
}
