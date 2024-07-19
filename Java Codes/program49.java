
public class program49{

    public static void main(String[] args) {
        int[][] array1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] array2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Print array1
        System.out.println("Array1:");
        printArray(array1);

        // Transpose array1
        int[][] transposed = transpose(array1);
        System.out.println("\nTransposed Array1:");
        printArray(transposed);

        // Add array1 and array2
        int[][] sum = add(array1, array2);
        System.out.println("\nSum of Array1 and Array2:");
        printArray(sum);

        // Subtract array2 from array1
        int[][] difference = subtract(array1, array2);
        System.out.println("\nDifference of Array1 and Array2:");
        printArray(difference);

        // Multiply array1 and array2
        int[][] product = multiply(array1, array2);
        System.out.println("\nProduct of Array1 and Array2:");
        printArray(product);

        // Find min and max in array1
        int min = findMin(array1);
        int max = findMax(array1);
        System.out.println("\nMinimum value in Array1: " + min);
        System.out.println("Maximum value in Array1: " + max);

        // Sum all elements in array1
        int totalSum = sumAllElements(array1);
        System.out.println("\nSum of all elements in Array1: " + totalSum);

        // Sum of each row in array1
        int[] rowSums = sumRows(array1);
        System.out.println("\nSum of each row in Array1:");
        for (int i = 0; i < rowSums.length; i++) {
            System.out.println("Row " + (i + 1) + ": " + rowSums[i]);
        }

        // Sum of each column in array1
        int[] columnSums = sumColumns(array1);
        System.out.println("\nSum of each column in Array1:");
        for (int i = 0; i < columnSums.length; i++) {
            System.out.println("Column " + (i + 1) + ": " + columnSums[i]);
        }
    }

    // Print the 2-D array
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Transpose the 2-D array
    public static int[][] transpose(int[][] array) {
        int[][] transposed = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transposed[j][i] = array[i][j];
            }
        }
        return transposed;
    }

    // Add two 2-D arrays
    public static int[][] add(int[][] array1, int[][] array2) {
        int[][] result = new int[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return result;
    }

    // Subtract one 2-D array from another
    public static int[][] subtract(int[][] array1, int[][] array2) {
        int[][] result = new int[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                result[i][j] = array1[i][j] - array2[i][j];
            }
        }
        return result;
    }

    // Multiply two 2-D arrays
    public static int[][] multiply(int[][] array1, int[][] array2) {
        int[][] result = new int[array1.length][array2[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int k = 0; k < array1[0].length; k++) {
                    result[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return result;
    }

    // Find the minimum value in a 2-D array
    public static int findMin(int[][] array) {
        int min = array[0][0];
        for (int[] row : array) {
            for (int val : row) {
                if (val < min) {
                    min = val;
                }
            }
        }
        return min;
    }

    // Find the maximum value in a 2-D array
    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int[] row : array) {
            for (int val : row) {
                if (val > max) {
                    max = val;
                }
            }
        }
        return max;
    }

    // Sum all elements in a 2-D array
    public static int sumAllElements(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int val : row) {
                sum += val;
            }
        }
        return sum;
    }

    // Sum each row in a 2-D array
    public static int[] sumRows(int[][] array) {
        int[] rowSums = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rowSums[i] += array[i][j];
            }
        }
        return rowSums;
    }

    // Sum each column in a 2-D array
    public static int[] sumColumns(int[][] array) {
        int[] columnSums = new int[array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                columnSums[j] += array[i][j];
            }
        }
        return columnSums;
    }
}
