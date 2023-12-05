import java.util.Scanner;

public class Lab3Problem3 {
    public static void main(String[] args) {
        Scanner java= new Scanner(System.in);
        int s;
        System.out.print("Input the length of a side of the hexagon:");
        s=java.nextInt();
       // Area of a hexagon = (6 * s^2)/(4*tan(π/6))
        double hexagon=((6 * s*s)/(4*Math.tan(Math.PI/6)));
        System.out.print("The area of the hexagon is:");
        System.out.println(hexagon);
    }
}
