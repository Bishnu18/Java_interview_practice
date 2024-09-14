package ARRAY;

import java.util.Scanner;

public class K_sum {
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
         for (int i = 0; i < n-k+1; i++) {
             int sum = 0;
             for (int j = i; j < i+k; j++) {
                 sum += arr[j];
             }
             System.out.println("("+i+","+(i+k-1)+")="+sum);
         }
    }
}
