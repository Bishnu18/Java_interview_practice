package LEC3;

import java.util.*;

public class F_C_converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minf= sc.nextInt();
        int maxf= sc.nextInt();
        int step= sc.nextInt();
        for(int i=minf; i<=maxf; i=i+step){
            int ans=(int) (5/9.0*(i-32));
            System.out.println(i+"\t"+ans);
        }
    }
}
