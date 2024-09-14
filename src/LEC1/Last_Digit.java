package LEC1;

public class Last_Digit {
    public static void main(String[] args) {
        int n=123;
        int rem=n%10;
        n=n/10;
        n=n%10;
        System.out.println("midlle"+n);
        System.out.println("last"+rem);
    }
}
