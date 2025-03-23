import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first matrix (dimensions and elements)
        System.out.print("Enter number of rows for the first matrix: ");
        int n1 = scanner.nextInt(); // Number of rows of the first matrix
        System.out.print("Enter number of columns for the first matrix: ");
        int m1 = scanner.nextInt(); // Number of columns of the first matrix

        int[][] a1 = new int[n1][m1];
        System.out.println("Enter " + (n1 * m1) + " elements for the first matrix:");
        // Elements of the first matrix
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                a1[i][j] = scanner.nextInt();
            }
        }

        // Input for the second matrix (dimensions and elements)
        System.out.print("Enter number of rows for the second matrix: ");
        int n2 = scanner.nextInt(); // Number of rows of the second matrix
        System.out.print("Enter number of columns for the second matrix: ");
        int m2 = scanner.nextInt(); // Number of columns of the second matrix

        // Second matrix
        int[][] a2 = new int[n2][m2];
        System.out.println("Enter " + (n2 * m2) + " elements for the second matrix:");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                a2[i][j] = scanner.nextInt();
            }
        }

        // Check if matrix multiplication is possible
        if (m1 != n2) {
            System.out.println("Invalid input");
        } else {
            int[][] prd = new int[n1][m2];

            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    for (int k = 0; k < m1; k++) {
                        prd[i][j] += a1[i][k] * a2[k][j];
                    }
                }
            }

            System.out.println("Resultant Matrix:");
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    System.out.print(prd[i][j] + " "); // Each element of the result matrix
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
