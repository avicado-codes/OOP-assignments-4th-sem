// write a java program to compute the value of Euler's number using the formula
// e = 1/1! + 1/2! + ... + 1/n!

package week2;
import java.util.*;

class ComputeEulerNumber{
    void exp(int n){
        if (n <= 0) return;
        FactorialCalculation fact = new FactorialCalculation();
        double e = 0.0;
        for (int i = 0; i < n; i++) {
            e += 1.0/(fact.calculate(i));
        }
        System.out.println("e: "+ e);
    }
}


public class Program18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        ComputeEulerNumber eu = new ComputeEulerNumber();

        eu.exp(n);
    }
}
