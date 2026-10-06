class Appliance {
    private String name;
    private int powerRatingWatts; // power rating in watts
    private boolean status;       // true = ON, false = OFF

    // Constructor
    public Appliance(String name, int powerRatingWatts) {
        this.name = name;
        this.powerRatingWatts = powerRatingWatts;
        this.status = false; // initially OFF
    }

    // Methods to control appliance
    public void turnOn() {
        status = true;
        System.out.println(name + " is turned ON.");
    }

    public void turnOff() {
        status = false;
        System.out.println(name + " is turned OFF.");
    }

    // Calculate daily units consumed (kWh)
    public double calculateDailyUnits(double hoursUsed) {
        return (powerRatingWatts * hoursUsed) / 1000.0;
    }

    public String getName() {
        return name;
    }
}

public class SmartHome7 {
    public static void main(String[] args) {
        // Create appliances
        Appliance fan = new Appliance("Fan", 75);
        Appliance ac = new Appliance("Air Conditioner", 1500);
        Appliance light = new Appliance("Light", 60);

        // Turn them on
        fan.turnOn();
        ac.turnOn();
        light.turnOn();

        // Assume usage hours
        double fanHours = 8;
        double acHours = 5;
        double lightHours = 10;

        // Calculate daily consumption
        double fanUnits = fan.calculateDailyUnits(fanHours);
        double acUnits = ac.calculateDailyUnits(acHours);
        double lightUnits = light.calculateDailyUnits(lightHours);

        double totalUnits = fanUnits + acUnits + lightUnits;

        // Display results
        System.out.println("\nDaily Power Consumption:");
        System.out.println(fan.getName() + ": " + fanUnits + " kWh");
        System.out.println(ac.getName() + ": " + acUnits + " kWh");
        System.out.println(light.getName() + ": " + lightUnits + " kWh");
        System.out.println("Total Consumption: " + totalUnits + " kWh");
    }
}
