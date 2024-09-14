package ARRAY;
import java.util.*;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.print("Enter the first index to swap: ");
        int index1 = scanner.nextInt();
        System.out.print("Enter the second index to swap: ");
        int index2 = scanner.nextInt();
        if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
            System.out.println("Array after swap: " + Arrays.toString(array));
        } else {
            System.out.println("Invalid");
        }
        scanner.close();
    }
}

