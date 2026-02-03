// write a java program to find the area and parameter of a circle

package week1;
import java.util.*;

class Circle{
    public double perimeter(double radius){
        return 2* Math.PI* radius;
    }
    public double area(double radius){
        return Math.PI* radius* radius;
    }
}

public class Program5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();

        System.out.print("Enter the radius of the circle: ");

        double radius = input.nextDouble();

        System.out.println("Perimeter: "+ circle.perimeter(radius)+" units");
        System.out.println("Area: "+ circle.area(radius)+ " sq.units");

        input.close();
    }
}
