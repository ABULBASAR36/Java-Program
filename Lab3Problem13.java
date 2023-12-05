import java.util.Scanner;

public class Lab3Problem13 {
    public static void main(String[] args) {
        Scanner java=new Scanner(System.in);
        int n,t,sum=0,c=0;
        t=java.nextInt();
        System.out.print("Input number:");
        n=java.nextInt();

        for(int i=1;i<=t;i++)
        {
          sum=n+c*sum;
          if(i<t)
          System.out.printf("%d+",sum);
          else
          System.out.print(sum);
          c=0;
          c+=10;
        }
    }
}
