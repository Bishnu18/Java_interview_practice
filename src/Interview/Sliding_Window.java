package Interview;

import java.util.Scanner;

public class Sliding_Window {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sliding_sum=0;
        for (int i = 0; i < k; i++) {
            sliding_sum+=arr[i];
        }
        System.out.println("("+0+","+(k-1)+")="+sliding_sum);
        for (int i = 1; i <n-k+1 ; i++) {
            sliding_sum=sliding_sum+arr[k+i-1]-arr[i-1];
            System.out.println("("+i+","+(i+k-1)+")->"+sliding_sum);
        }
    }

}
