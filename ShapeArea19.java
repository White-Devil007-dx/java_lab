abstract class Shape {
    abstract double area();

    void describe() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

public class ShapeArea19 {
    public static void main(String[] args) {
        Shape shapes[] = {
            new Circle(5),
            new Rectangle(10, 5),
            new Triangle(8, 6)
        };

        double total = 0;

        for (Shape s : shapes) {
            s.describe();
            System.out.println("Area: " + s.area());
            System.out.println();
            total = total + s.area();
        }

        System.out.println("Total Area: " + total);
    }
}