import java.util.*;

class MenuItem {
    private String name;
    private String category;
    private double price;

    public MenuItem(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
}

public class Restaurant8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Build a small menu
        List<MenuItem> menu = new ArrayList<>();
        menu.add(new MenuItem("Pizza", "Main Course", 250));
        menu.add(new MenuItem("Burger", "Main Course", 150));
        menu.add(new MenuItem("Coke", "Beverage", 50));
        menu.add(new MenuItem("Ice Cream", "Dessert", 100));

        // Display menu
        System.out.println("Menu:");
        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.get(i);
            System.out.println((i+1) + ". " + item.getName() + " (" + item.getCategory() + ") - Rs." + item.getPrice());
        }

        // Customer order
        List<MenuItem> order = new ArrayList<>();
        System.out.println("\nEnter item numbers to order (0 to finish):");
        while (true) {
            int choice = sc.nextInt();
            if (choice == 0) break;
            if (choice >= 1 && choice <= menu.size()) {
                order.add(menu.get(choice-1));
                System.out.println(menu.get(choice-1).getName() + " added to order.");
            } else {
                System.out.println("Invalid choice.");
            }
        }

        // Calculate bill
        double subtotal = 0;
        System.out.println("\nYour Order:");
        for (MenuItem item : order) {
            System.out.println(item.getName() + " - Rs." + item.getPrice());
            subtotal += item.getPrice();
        }

        double gst = subtotal * 0.05;
        double total = subtotal + gst;

        System.out.println("\nSubtotal: Rs." + subtotal);
        System.out.println("GST (5%): Rs." + gst);
        System.out.println("Final Bill: Rs." + total);

        sc.close();
    }
}
