package LEC1;

public class Fact {
    public static void main(String[] args) {
        int i=1;
        int fact=1;
        while(i<=35){
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
