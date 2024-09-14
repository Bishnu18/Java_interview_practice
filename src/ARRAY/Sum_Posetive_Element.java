package ARRAY;

import java.util.Scanner;

public class Sum_Posetive_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                sum+=arr[i];
            }
        }
        System.out.println("The sum of the elements of the array is "+sum);
    }
}

