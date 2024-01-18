import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for matrices: ");
        int columns = scanner.nextInt();

        int[][] matrix1 = inputMatrix("Enter elements for Matrix 1:", rows, columns, scanner);
        int[][] matrix2 = inputMatrix("Enter elements for Matrix 2:", rows, columns, scanner);

        // Matrix Addition
        int[][] additionResult = addMatrices(matrix1, matrix2);
        System.out.println("Matrix Addition Result:");
        displayMatrix(additionResult);

        // Matrix Multiplication
        int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
        if (multiplicationResult != null) {
            System.out.println("Matrix Multiplication Result:");
            displayMatrix(multiplicationResult);
        }

        // Reverse Matrix
        int[][] reverseResult = reverseMatrix(matrix1);
        System.out.println("Reversed Matrix:");
        displayMatrix(reverseResult);

        scanner.close();
    }

    private static int[][] inputMatrix(String prompt, int rows, int columns, Scanner scanner) {
        System.out.println(prompt);
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;

        if (columns1 != rows2) {
            System.out.println("Matrix multiplication not possible. Invalid dimensions.");
            return null;
        }

        int[][] result = new int[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    private static int[][] reverseMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix[rows - 1 - i][columns - 1 - j];
            }
        }

        return result;
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

