import java.util.Scanner;

public class array_delete {
    public static void main(String[] args) {
        int index, pos;
        try (Scanner sc = new Scanner(System.in)) {
            // taking input from the user
            System.out.println("Enter the number of elemnets of Arrays");
            index = sc.nextInt();

            // creating array
            int[] arr1 = new int[index];
            // creating a new array
            int[] arr2 = new int[index + 1];

            // saving values
            System.out.println("Enter Values");
            for (int i = 0; i < index; i++) {
                arr1[i] = sc.nextInt();
            }

            System.out.println("Enter Index from 0-" + (index - 1));
            pos = sc.nextInt();

            for (int i = 0; i < arr1.length; i++) {
                if (i < pos) {
                    arr2[i] = arr1[i];
                } else if (i == pos)
                    continue;
                else {
                    arr2[i - 1] = arr1[i];
                }
            }

            // reading values from new array arr2
            System.out.println("elements are:");
            for (int i = 0; i < index - 1; i++) {
                System.out.println(arr2[i]);
            }
        }

    }// end main
}// end class