interface InsurancePolicy {
    double calculatePremium();
    void getCoverageDetails();
}

class CarInsurance implements InsurancePolicy {
    double value;

    CarInsurance(double value) {
        this.value = value;
    }

    public double calculatePremium() {
        return value * 0.03;
    }

    public void getCoverageDetails() {
        System.out.println("Coverage: Car damage, theft and accident");
    }
}

class BikeInsurance implements InsurancePolicy {
    double value;

    BikeInsurance(double value) {
        this.value = value;
    }

    public double calculatePremium() {
        return value * 0.02;
    }

    public void getCoverageDetails() {
        System.out.println("Coverage: Bike damage, theft and accident");
    }
}

class TruckInsurance implements InsurancePolicy {
    double value;

    TruckInsurance(double value) {
        this.value = value;
    }

    public double calculatePremium() {
        return value * 0.04;
    }

    public void getCoverageDetails() {
        System.out.println("Coverage: Truck damage, theft and accident");
    }
}

public class VehicleInsurance24 {
    public static void main(String[] args) {
        InsurancePolicy car = new CarInsurance(800000);
        InsurancePolicy bike = new BikeInsurance(100000);
        InsurancePolicy truck = new TruckInsurance(1500000);

        System.out.println("Car Insurance");
        System.out.println("Premium: " + car.calculatePremium());
        car.getCoverageDetails();

        System.out.println();

        System.out.println("Bike Insurance");
        System.out.println("Premium: " + bike.calculatePremium());
        bike.getCoverageDetails();

        System.out.println();

        System.out.println("Truck Insurance");
        System.out.println("Premium: " + truck.calculatePremium());
        truck.getCoverageDetails();
    }
}