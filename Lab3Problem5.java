import java.util.Scanner;

public class Lab3Problem5 {
    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        double x1,x2,y1,y2;
        System.out.print("Input the latitude of coordinate x1:");
        x1=cin.nextDouble();
        System.out.print("Input the latitude of coordinate x2:");
        x2=cin.nextDouble();
        System.out.print("Input the longitude of coordinate y1:");
        y1=cin.nextDouble();
        System.out.print("Input the longitude of coordinate y1:");
        y2=cin.nextDouble();
        double radius=6371.01;
       // System.out.printf("Radius of the earth = %f",radius);
        //d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
        double distance=(radius*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)));
        System.out.print("The distance between those points is:");
        System.out.println(distance);


    }
}
