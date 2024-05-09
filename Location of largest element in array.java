import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[][] array = readTwoDimensionalArrayFromUser();
        int[] location = locateLargest(array);
        System.out.println("The largest element is at row " + location[0] + " and column " + location[1]);
    }

    public static int[] locateLargest(double[][] a) {
        int[] location = new int[2]; // location[0] for row, location[1] for column
        double largest = a[0][0];
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if (a[row][col] > largest) {
                    largest = a[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    public static double[][] readTwoDimensionalArrayFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int numCols = scanner.nextInt();
        double[][] array = new double[numRows][numCols];

        System.out.println("Enter the elements of the array:");
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                array[row][col] = scanner.nextDouble();
            }
        }
        return array;
    }
}