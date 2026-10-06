abstract class SubscriptionPlan {
    int screens;
    int features;

    SubscriptionPlan(int screens, int features) {
        this.screens = screens;
        this.features = features;
    }

    abstract double calculateMonthlyFee();

    void displayPlan() {
        System.out.println("Screens: " + screens);
        System.out.println("Features: " + features);
        System.out.println("Monthly Fee: " + calculateMonthlyFee());
    }
}

class BasicPlan extends SubscriptionPlan {
    BasicPlan() {
        super(1, 2);
    }

    double calculateMonthlyFee() {
        return 199;
    }
}

class StandardPlan extends SubscriptionPlan {
    StandardPlan() {
        super(2, 4);
    }

    double calculateMonthlyFee() {
        return 399;
    }
}

class PremiumPlan extends SubscriptionPlan {
    PremiumPlan() {
        super(4, 6);
    }

    double calculateMonthlyFee() {
        return 699;
    }
}

public class StreamingService21 {
    public static void main(String[] args) {
        SubscriptionPlan basic = new BasicPlan();
        SubscriptionPlan standard = new StandardPlan();
        SubscriptionPlan premium = new PremiumPlan();

        System.out.println("Basic Plan");
        basic.displayPlan();

        System.out.println();

        System.out.println("Standard Plan");
        standard.displayPlan();

        System.out.println();

        System.out.println("Premium Plan");
        premium.displayPlan();
    }
}