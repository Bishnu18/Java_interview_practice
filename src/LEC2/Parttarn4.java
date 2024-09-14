package LEC2;

import java.util.Scanner;

public class Parttarn4 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int n = 5;
        for (int row=0;row<=n;row++){
            for (int col=0;col<n-row;col++){
                System.out.print("*"+" ");
            }
            for (int space=0;space<row;space++){
                System.out.print(" "+" ");

            }
            System.out.println();
        }
    }
}
