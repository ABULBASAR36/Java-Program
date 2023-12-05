import java.util.Scanner;

public class Lab3Problem19 {
    public static void main(String[] args) {
        Scanner java= new Scanner(System.in);
        System.out.println("Divided by 3:");
        for(int i=1;i<=100;i++)
        {
            if(i%3==0&&i==3)
            {
                System.out.printf("%d",i);
            }
            else if(i%3==0)
            {
                System.out.print(","+i);
            }
        }
        System.out.println();
        System.out.println("Divided by 5:");
        for(int i=1;i<=100;i++)
        {
            if(i%5==0 && i==5)
            {
                System.out.print(" "+i);
            }
            else if(i%5==0)
            {
                System.out.print(","+i);
            }
        }
        System.out.println();
        System.out.println("Divided by 3 && 5:");
        for(int i=1;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.print(" "+i);
            }
        }
    }
}
