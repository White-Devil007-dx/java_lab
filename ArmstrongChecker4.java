public class ArmstrongChecker4 {
    public static void main(String[] args) {
        // Loop through all command-line arguments
        for (String arg : args) {
            int num = Integer.parseInt(arg);  // Convert string to integer
            int original = num;
            int n = 0;

            // Count digits
            int temp = num;
            while (temp != 0) {
                temp /= 10;
                n++;
            }

            // Compute sum of powers
            int sum = 0;
            temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, n);
                temp /= 10;
            }

            // Check Armstrong condition
            if (sum == original) {
                System.out.println(original + " is an Armstrong number.");
            } else {
                System.out.println(original + " is NOT an Armstrong number.");
            }
        }
    }
}
