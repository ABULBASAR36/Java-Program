import java.util.Scanner;

public class Lab3Problem18 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int t;
        System.out.print("Input a number:");
        t=cin.nextInt();
        if(t%2==0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}
