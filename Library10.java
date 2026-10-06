import java.util.*;

// Abstract base class
abstract class Reservation {
    private String bookTitle;

    public Reservation(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    // Abstract method to be overridden
    public abstract void confirmReservation();
}

// Subclass: OnlineReservation
class OnlineReservation extends Reservation {
    public OnlineReservation(String bookTitle) {
        super(bookTitle);
    }

    @Override
    public void confirmReservation() {
        System.out.println("Online reservation confirmed for book: " + getBookTitle());
    }
}

// Subclass: CounterReservation
class CounterReservation extends Reservation {
    public CounterReservation(String bookTitle) {
        super(bookTitle);
    }

    @Override
    public void confirmReservation() {
        System.out.println("Counter reservation confirmed for book: " + getBookTitle());
    }
}

// Member class with 1-to-many association
class Member {
    private String name;
    private ArrayList<Reservation> reservations;

    public Member(String name) {
        this.name = name;
        this.reservations = new ArrayList<>();
    }

    public void addReservation(Reservation r) {
        reservations.add(r);
    }

    public void showReservations() {
        System.out.println("\nReservations for member: " + name);
        for (Reservation r : reservations) {
            r.confirmReservation(); // Polymorphic call
        }
    }
}

// Main class
public class Library10 {
    public static void main(String[] args) {
        Member m1 = new Member("Chakri");

        // Add different types of reservations
        m1.addReservation(new OnlineReservation("Harry Potter"));
        m1.addReservation(new CounterReservation("Data Structures in Java"));
        m1.addReservation(new OnlineReservation("Operating System Concepts"));

        // Display reservations
        m1.showReservations();
    }
}
