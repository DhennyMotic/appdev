import java.util.*;
public class Rectangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first side value: ");
        double side = scan.nextDouble();
        System.out.println("Enter the second side value: ");
        double side2 = scan.nextDouble();
        double a = area(side, side2);
        double p = perimeter(side, side2);
        System.out.println("The area is: " + a);
        System.out.println("The perimeter is: " + p);
    }


    public static double area(double side, double side2){
        return side*side2;
    }
    public static double perimeter( double side, double side2){
        return (side + side2)*2;
    }
}