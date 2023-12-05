import java.util.Scanner;

public class Lab3Problem2 {
    public static void main(String[] args) {
        Scanner java =new Scanner(System.in);
        int a,tem,rem,sum=0;
        System.out.print("Input a intiger number: ");
        a=java.nextInt();
        tem=a;
        while(tem!=0)
        {
            rem=tem%10;
            sum=sum+rem;
            tem=tem/10;
        }
        System.out.print("The sum of the digits is: ");
        System.out.println(sum);
    }
}
