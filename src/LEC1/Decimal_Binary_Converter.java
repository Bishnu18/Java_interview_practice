package LEC1;

public class Decimal_Binary_Converter {
    public static void main(String[] args) {
        int dec=25;
        int b1 = 0;
        int rem;
        int rev=1;
        while (dec>0){
          rem=dec%2;
          dec=dec/2;
          b1=b1+rem*rev;
          rev=rev*10;
        }
        System.out.println(b1);
    }
}
