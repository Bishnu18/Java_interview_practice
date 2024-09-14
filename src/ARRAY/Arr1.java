package ARRAY;

import java.util.*;

public class Arr1 {
    public static void main(String[] args) {
        int arr[]=new int[10];
//
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        int b[]=new int[15];
        b=arr;
        System.out.println();
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]+" ");
        }
        b[0]=-10;
        System.out.println(arr[0]+" ");
    }
}
