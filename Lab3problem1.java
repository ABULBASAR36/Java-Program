import java.util.Scanner;

public class Lab3problem1 {
    public static void main(String[] args) {
        Scanner java =new Scanner(System.in);
       int a,b;
       System.out.print("Input First number: ");
       a=java.nextInt();
       System.out.print("Input second number: ");
       b=java.nextInt();
       if(a!=b)
       {
        System.out.printf("%d!=%d\n",a,b);
       }
       if(a<b)
       {
        System.out.printf("%d<%d\n",a,b);
       }
       if(a<=b)
       {
        System.out.printf("%d<=%d\n",a,b);
       }
    }
}
