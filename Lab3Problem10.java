import java.util.Scanner;

public class Lab3Problem10 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter a character: ");
        //char Ch= cin.next().charAt(0);
        char Ch=cin.next().charAt(0);
        System.out.printf("The ASCII value of %c is :",Ch);
         int s= Ch;
        System.out.printf("%d ",s);

        // Close the scanner when you're done with it
        //scanner.close();

    }
}
