import java.util.Scanner;

public class Matrix5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] sum = new int[3][3];
        int[][] diff = new int[3][3];
        int[][] product = new int[3][3];

        // Input matrix A
        System.out.println("Enter elements of Matrix A (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input matrix B
        System.out.println("Enter elements of Matrix B (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Addition and Subtraction
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = A[i][j] + B[i][j];
                diff[i][j] = A[i][j] - B[i][j];
            }
        }

        // Multiplication
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                product[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display results
        System.out.println("\nMatrix Addition:");
        printMatrix(sum);

        System.out.println("\nMatrix Subtraction:");
        printMatrix(diff);

        System.out.println("\nMatrix Multiplication:");
        printMatrix(product);

        sc.close();
    }

    // Helper method to print a 3x3 matrix
    public static void printMatrix(int[][] M) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
}
