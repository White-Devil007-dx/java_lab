import java.util.Scanner;

public class Exam6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] scores = new int[n];

        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // Initialize values
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        // Find largest and second largest
        for (int score : scores) {
            if (score > largest) {
                secondLargest = largest;
                largest = score;
            } else if (score > secondLargest && score != largest) {
                secondLargest = score;
            }
        }

        // Find smallest and second smallest
        for (int score : scores) {
            if (score < smallest) {
                secondSmallest = smallest;
                smallest = score;
            } else if (score < secondSmallest && score != smallest) {
                secondSmallest = score;
            }
        }

        // Check if sorted ascending
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                sorted = false;
                break;
            }
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Largest score: " + largest);
        System.out.println("Second largest score: " + (secondLargest == Integer.MIN_VALUE ? "N/A" : secondLargest));
        System.out.println("Smallest score: " + smallest);
        System.out.println("Second smallest score: " + (secondSmallest == Integer.MAX_VALUE ? "N/A" : secondSmallest));
        System.out.println("Array sorted ascending? " + (sorted ? "Yes" : "No"));

        sc.close();
    }
}
