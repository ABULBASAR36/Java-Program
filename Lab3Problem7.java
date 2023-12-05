import java.util.Scanner;

public class Lab3Problem7 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String s;
        System.out.print("The string is :");
        s=cin.nextLine();
        int i,number=0,letters=0,space=0,other=0;
        char[] ch=s.toCharArray();
        for(i=0;i<s.length();i++)
        {
         if(Character.isLetter(ch[i]))
         {
            letters++;
         }
         else if(Character.isDigit(ch[i]))
         {
            number++;
         }
         else if(Character.isWhitespace(ch[i]))
         {
            space++;
         }
         else
         other++;
        }
        System.out.println("Letters: "+letters);
        System.out.println("Number: "+number);
        System.out.println("Space:"+space);
        System.out.println("Other: "+other);
    }
}
