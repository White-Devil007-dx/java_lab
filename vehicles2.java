public class vehicles2 {
    public static void main(String[] args){
        car c = new car("car");
        bike b = new bike("Bike");
        truck t = new truck("Truck");

        Vehicle[] vehicles = {c,b,t};

        for(Vehicle v : vehicles){
            System.out.println(v.getName() + " rental cost for 5 days is " +  v.calculateRentalcost(5));
        }
    }
}
abstract class Vehicle {
    private String Name;
    Vehicle(String Name){
        this.Name = Name;
    }
    abstract int calculateRentalcost(int days);

    public String getName(){
        return Name;
    }
};

class car extends Vehicle{
    car(String name){
        super(name);
    }
    @Override 
    public int calculateRentalcost(int days){
        return 500 * days;
    }
};

class bike extends Vehicle{
    bike(String name){
        super(name);
    }
    @Override
    public int calculateRentalcost(int days){
        return 250 * days;
    }
};

class truck extends Vehicle{
    truck(String name){
        super(name);
    }
    @Override 
    public int calculateRentalcost(int days){
        return 1000 * days;
    }
}

