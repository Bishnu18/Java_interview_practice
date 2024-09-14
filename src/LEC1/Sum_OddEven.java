package LEC1;

public class Sum_OddEven {
    public static void main(String[] args) {
        int n=123;
        int sum=0;
        int eve_sum=0;
        int odd_sum=0;
        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                eve_sum=eve_sum+rem;
            }
            else {
                odd_sum=odd_sum+rem;
            }
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Even Sum: "+eve_sum);
        System.out.println("Odd Sum: "+odd_sum);
        System.out.println("Sum: "+sum);
    }
}
