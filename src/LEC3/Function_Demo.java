package LEC3;

public class Function_Demo {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int ans=Add(a,b);
        int ans1=Sub(a,b);
        System.out.println(ans);
        System.out.println(ans1);
    }
    public static int Add(int a,int b){
        int c=a+b;
        return c;

    }
    public static int Sub(int a,int b){
        int c1=a-b;
        return c1;
    }

}
