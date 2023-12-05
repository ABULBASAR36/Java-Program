import java.util.Scanner;

public class Lab3Problem17 {
    public static void main(String[] args) {
        Scanner java= new Scanner(System.in);
        int t;
        t=java.nextInt();
        for(int i=1;i<=t;i++)
        {
          if(i%2!=0)
          {
            System.out.println(i);
          }
        }
    }
}
