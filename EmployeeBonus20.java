abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();

    void displayPay() {
        double bonus = calculateBonus();
        double total = salary + bonus;

        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Pay: " + total);
        System.out.println();
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return salary * 0.15;
    }
}

class Intern extends Employee {
    Intern(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return salary * 0.05;
    }
}

public class EmployeeBonus20 {
    public static void main(String[] args) {
        Employee employees[] = {
            new Manager("Kaushal", 60000),
            new Developer("Rahul", 50000),
            new Intern("Priya", 20000)
        };

        for (Employee e : employees) {
            e.displayPay();
        }
    }
}
