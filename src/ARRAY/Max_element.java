package ARRAY;

import java.util.Scanner;

public class Max_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        c=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>c){
                c=arr[i];
            }
        }
        System.out.println("Max"+c);
    }
}
