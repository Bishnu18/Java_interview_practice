package LEC2;

import java.util.Scanner;

public class Pattarn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row=1;row<=n;row++){
            for (int space=1;space<=n-row;space++){
                System.out.print(" "+" ");
            }
            for (int star=1;star<row;star++){
                System.out.print("*"+" ");

            }
            System.out.println();
        }
    }
}