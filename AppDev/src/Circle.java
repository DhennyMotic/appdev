import java.util.*;
public class Circle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of the radius: ");
        double radius = scan.nextDouble();
        double a = area(radius);
        double p = perimeter(radius);
        System.out.println("The area is: " + a);
        System.out.println("The perimeter is: " + p);
     }

    public static double area(double radius){
        return Math.PI*radius*radius;
    }
    public static double perimeter(double radius){
        return 2*Math.PI*radius;
    }
}
