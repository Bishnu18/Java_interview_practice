package ARRAY;

import java.util.Scanner;

public class Count_same_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 3) {
                count ++;
            }
            if (arr[i] == 0) {
                System.out.println("-1");
            }else {
                if (count%3 == 2) {
                    System.out.println(count+ "divisible by 3");
                }else {
                    System.out.println("not divisible by 3");
                }
            }
        }
    }
}
