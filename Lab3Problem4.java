import java.util.Scanner;

public class Lab3Problem4 {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        int s,n;
      System.out.print("Input the number of sides on the polygon:");
      n=java.nextInt();
      System.out.print("Input the length of one of the sides:");
      s=java.nextInt();
      //Area of a polygon = (n*s^2)/(4*tan(π/n))
      double plygon=((n*s*s)/(4*Math.tan(Math.PI/n)));
      System.out.printf("The area is:%f",plygon);
    }
}
