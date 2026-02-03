// write a java program to convert miles to kilometers

package week1;
import java.util.*;

class Convert{
    public double covertToKilometers(double miles){
        return miles * 1.60934;
    }
}

public class Program10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Convert m = new Convert();

        System.out.print("Enter the distance in miles: ");
        double miles = input.nextDouble();

        System.out.printf("In kilometers: %f",m.covertToKilometers(miles));

        input.close();
    }
}
