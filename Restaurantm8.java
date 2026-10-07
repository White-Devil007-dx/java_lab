import java.util.Scanner;

class MenuItem {
    String name;
    String category;
    double price;

    // Constructor
    MenuItem(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
}

public class RestaurantBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu items
        MenuItem[] menu = {
            new MenuItem("Burger", "Fast Food", 120),
            new MenuItem("Pizza", "Fast Food", 250),
            new MenuItem("Biryani", "Main Course", 200),
            new MenuItem("Coffee", "Beverage", 80),
            new MenuItem("Ice Cream", "Dessert", 100)
        };

        // Display menu
        System.out.println("----- RESTAURANT MENU -----");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].name
                    + " - " + menu[i].category
                    + " - ₹" + menu[i].price);
        }

        // Take order
        System.out.print("\nEnter number of items to order: ");
        int n = sc.nextInt();

        MenuItem[] order = new MenuItem[n];

        double subtotal = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter menu item number: ");
            int choice = sc.nextInt();

            order[i] = menu[choice - 1];
            subtotal += order[i].price;
        }

        // Calculate GST and final bill
        double gst = subtotal * 0.05;
        double finalBill = subtotal + gst;

        // Display bill
        System.out.println("\n------- BILL -------");

        for (int i = 0; i < order.length; i++) {
            System.out.println(order[i].name + " - ₹" + order[i].price);
        }

        System.out.println("--------------------");
        System.out.printf("Subtotal : ₹%.2f%n", subtotal);
        System.out.printf("GST (5%%) : ₹%.2f%n", gst);
        System.out.printf("Final Bill: ₹%.2f%n", finalBill);

        sc.close();
    }
}
