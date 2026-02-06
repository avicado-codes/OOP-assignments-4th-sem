// write a java program to calculate factorial

package week2;
import java.util.*;

class FactorialCalculation{
    public int calculate(int num){
        if (num == 0) return 1;
        return num*calculate(num-1);
    }
}

public class Program2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        FactorialCalculation fact = new FactorialCalculation();

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        System.out.println("Factorial of "+num+": "+fact.calculate(num));

        input.close();
    }
}
