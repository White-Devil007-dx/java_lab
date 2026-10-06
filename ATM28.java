/*ATM Withdrawal Validator — 
Simulate ATM withdrawal with user-defined InsufficientFundsException, InvalidAmountException, 
and DailyLimitExceededException. 
Use multiple catch blocks and a finally block that always logs the attempt.   */


import java.util.Scanner;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

class DailyLimitExceededException extends Exception {
    DailyLimitExceededException(String message) {
        super(message);
    }
}

public class ATM28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        double dailyLimit = 5000;

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            if (amount <= 0) {
                throw new InvalidAmountException("Invalid withdrawal amount.");
            }

            if (amount > dailyLimit) {
                throw new DailyLimitExceededException("Daily withdrawal limit exceeded.");
            }

            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient funds.");
            }

            balance = balance - amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);
        }
        catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
        catch (DailyLimitExceededException e) {
            System.out.println(e.getMessage());
        }
        catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("ATM withdrawal attempt logged.");
        }

        sc.close();
    }
}
