import java.util.*;


/*
Q30. Online Exam Registration Validator — 
Validate a student's exam registration number: 
user-defined InvalidFormatException (wrong pattern/length), 
user-defined DuplicateRegistrationException (already registered), 
and built-in NumberFormatException where a numeric field is expected.
*/

class InvalidFormatException extends Exception {
    InvalidFormatException(String message) {
        super(message);
    }
}

class DuplicateRegistrationException extends Exception {
    DuplicateRegistrationException(String message) {
        super(message);
    }
}

public class registrationNo30 {
    static String[] registeredNo = {"A25126552007", "A25126552046", "A25126552062", "A25126552064"};

    static void validate(String reg) throws InvalidFormatException, DuplicateRegistrationException {
        if (reg.length() != 12 || !reg.startsWith("A")) {
            throw new InvalidFormatException("Invalid Registration Number Format");
        }

        for (int i = 1; i<reg.length(); i++) {
            if (!Character.isDigit(reg.charAt(i))) {
                throw new InvalidFormatException("Invalid Reg Number Format");
            }
        }

        for (String r : registeredNo) {
            if (r.equals(reg)) {
                throw new DuplicateRegistrationException("Reg No already exists");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Reg No: ");
            String reg = sc.nextLine();

            System.out.print("Enter semester: ");
            String semIP = sc.nextLine();

            int sem = Integer.parseInt(semIP);

            validate(reg);

            System.out.println("Registration Successful");

        }
        catch (InvalidFormatException | DuplicateRegistrationException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Semester must be an number");
        }
        finally {
            sc.close();
        }
    }
}
