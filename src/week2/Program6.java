// write a java program to find out the roots of a quadratic equation

package week2;

import java.util.Scanner;

class QuadraticRoots{
    public void getRoots(double a, double b, double c){
        double d = b*b - 4*a*c;

        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2*a);
            double root2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("Roots: " + root1 + " and " + root2);
        } else if (d == 0) {
            double root = -b / (2*a);
            System.out.println("Roots: " + root + " and " + root);
        } else {
            double realPart = -b / (2*a);
            double imagPart = Math.sqrt(-d) / (2*a);
            System.out.println("Roots: " + realPart + " + " + imagPart + "i and "
                    + realPart + " - " + imagPart + "i");
        }

    }
}

public class Program6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        QuadraticRoots eqn = new QuadraticRoots();

        System.out.print("Enter a, b and, c separated by space: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        eqn.getRoots(a,b,c);

        input.close();
    }
}
