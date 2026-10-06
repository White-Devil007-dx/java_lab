interface PaymentMethod {
    void processPayment(double amount);
    double getTransactionFee();
}

class CreditCard implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Credit Card payment: " + amount);
    }

    public double getTransactionFee() {
        return 0.02;
    }
}

class DebitCard implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Debit Card payment: " + amount);
    }

    public double getTransactionFee() {
        return 0.01;
    }
}

class UPI implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("UPI payment: " + amount);
    }

    public double getTransactionFee() {
        return 0.005;
    }
}

public class PaymentGateway22 {
    public static void main(String[] args) {
        PaymentMethod payments[] = {
            new CreditCard(),
            new DebitCard(),
            new UPI()
        };

        double amount = 10000;

        for (PaymentMethod p : payments) {
            p.processPayment(amount);
            System.out.println("Transaction Fee: " + (amount * p.getTransactionFee()));
            System.out.println();
        }
    }
}