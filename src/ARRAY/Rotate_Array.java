package ARRAY;

import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int b[]=new int[2*n];

        for (int i = 0; i < n*2; i++) {
            b[i]=arr[i%n];
        }
        for(int i=k;i<k+n;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }
}
