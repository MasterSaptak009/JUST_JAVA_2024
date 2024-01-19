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


/*Certainly! Let's go through the code line by line:

```java
import java.util.Scanner;
```
This line imports the `Scanner` class from the `java.util` package, which is used for taking user input.

```java
public class MatrixOperations {
```
This line declares the start of the `MatrixOperations` class.

```java
    public static void main(String[] args) {
```
This line marks the beginning of the `main` method, which is the entry point of the Java program.

```java
        Scanner scanner = new Scanner(System.in);
```
Here, a `Scanner` object named `scanner` is created to read user input from the console.

```java
        System.out.print("Enter the number of rows for matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for matrices: ");
        int columns = scanner.nextInt();
```
These lines prompt the user to enter the number of rows and columns for the matrices and store the values in the variables `rows` and `columns`.

```java
        int[][] matrix1 = inputMatrix("Enter elements for Matrix 1:", rows, columns, scanner);
        int[][] matrix2 = inputMatrix("Enter elements for Matrix 2:", rows, columns, scanner);
```
These lines call the `inputMatrix` method to get user input for each matrix based on the specified dimensions.

```java
        // Matrix Addition
        int[][] additionResult = addMatrices(matrix1, matrix2);
        System.out.println("Matrix Addition Result:");
        displayMatrix(additionResult);
```
This section performs matrix addition by calling the `addMatrices` method and then displays the result using the `displayMatrix` method.

```java
        // Matrix Multiplication
        int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
        if (multiplicationResult != null) {
            System.out.println("Matrix Multiplication Result:");
            displayMatrix(multiplicationResult);
        }
```
This section performs matrix multiplication by calling the `multiplyMatrices` method. The `if` statement checks if multiplication is possible based on the dimensions, and if so, it displays the result.

```java
        // Reverse Matrix
        int[][] reverseResult = reverseMatrix(matrix1);
        System.out.println("Reversed Matrix:");
        displayMatrix(reverseResult);
```
This section reverses the first matrix by calling the `reverseMatrix` method and displays the result using the `displayMatrix` method.

```java
        scanner.close();
```
This line closes the `Scanner` to release resources associated with it.

```java
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
```
This method (`inputMatrix`) takes a prompt, number of rows, number of columns, and a `Scanner` object as parameters. It prompts the user to enter elements for a matrix and returns the matrix.

```java
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
```
This method (`addMatrices`) performs matrix addition and returns the result.

```java
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
```
This method (`multiplyMatrices`) performs matrix multiplication and returns the result. It also checks if the multiplication is possible based on matrix dimensions.

```java
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
```
This method (`reverseMatrix`) reverses a matrix and returns the result.

```java
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
```
This method (`displayMatrix`) displays the elements of a matrix. */