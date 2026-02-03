// write a java program to find out the area and perimeter of a rectangle

package week1;
import java.util.*;

class Rectangle{
    public double perimeter(double height, double width){
        return 2*(height+width);
    }
    public double area(double height, double width){
        return height*width;
    }
}

public class Program4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Enter the height and the width of the rectangle separated by space: ");

        double height = input.nextDouble();
        double width = input.nextDouble();

        System.out.println("Perimeter: "+ rectangle.perimeter(height,width));
        System.out.println("Area: "+ rectangle.area(height,width));

        input.close();
    }
}
