// write a java program to calculate the exponential of a number

package week2;
import java.util.*;

class Exponential{
        public double power(double base, double exponent) {
            return Math.pow(base, exponent);
        }
}

public class Program13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Exponential exp = new Exponential();

        System.out.print("Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter power: ");
        double power = input.nextDouble();

        System.out.printf("%f ^ %f = %f",base,power,exp.power(base,power));

        input.close();
    }
}
