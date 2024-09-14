package ARRAY;

import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length/2;i++){
            int a,b,c;
            a=arr[i];
            b=arr[arr.length-1-i];
            c=a;
            a=b;
            b=c;
            arr[i]=a;
            arr[arr.length-1-i]=b;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
