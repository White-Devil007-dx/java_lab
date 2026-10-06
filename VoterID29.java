/*Q29. Voter ID Age Validator — 
Validate age for voter registration: user-defined UnderAgeException (below 18),
built-in NumberFormatException (non-numeric input), 
and user-defined InvalidAgeException (negative or > 120). 
Test with multiple sample inputs. */

import java.util.Scanner;

class UnderAgeException extends Exception {
    UnderAgeException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class VoterID29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        String input = sc.nextLine();

        try {
            int age = Integer.parseInt(input);

            if (age < 0 || age > 120) {
                throw new InvalidAgeException("Invalid age.");
            }

            if (age < 18) {
                throw new UnderAgeException("You are under 18. Not eligible for voter registration.");
            }

            System.out.println("Eligible for voter registration.");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric age.");
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}