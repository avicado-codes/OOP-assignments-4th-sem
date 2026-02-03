// write a java program to add two numbers

package week1;
import java.util.Scanner;

class Add{
    public double performAddition(double a, double b){
        return a+b;
    }
}

public class Program2 {
    static public void main(String[] args){
        Scanner input = new Scanner(System.in);
        Add addition = new Add();

        System.out.print("Enter two numbers separated by space: ");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.printf("Sum: %.2f",addition.performAddition(a,b));

        input.close();
    }
}
