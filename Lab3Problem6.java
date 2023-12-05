import java.util.Scanner;

public class Lab3Problem6 {
    public static void main(String[] args) {
        Scanner java=new Scanner(System.in);
        String s;
         System.out.print("Input a string:");
        s=java.nextLine();
        String strr="";
        for(int i=s.length()-1;i>=0;i--)
        {
            strr=strr+s.charAt(i);
        }
        System.out.print("Reverse string:");
        System.out.println(strr);
    }
}
