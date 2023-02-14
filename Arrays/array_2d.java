import java.util.Scanner;

public class array_2d {
    public static void main(String[] args) {
        int row, col;
        try (Scanner sc = new Scanner(System.in)) {
            // taking input
            System.out.println("Enter the number of rows");
            row = sc.nextInt();
            System.out.println("Enter the number of columns");
            col = sc.nextInt();

            // making a 2D array
            System.out.println("A matrix of " + row + " x " + col + " is created successfully!");
            int arr[][] = new int[row][col];

            // taking values for the matrix
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.println("Enter value for [" + i + "][" + j + "]");
                    arr[i][j] = sc.nextInt();
                }
            }

            // reading values from the array
            System.out.println("Values are: ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

    }// end main
}// end class
