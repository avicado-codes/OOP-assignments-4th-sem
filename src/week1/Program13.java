// write a java program to check whether a number is divisible by 5 or not

package week1;
import java.util.*;

class Divisibility{
    public void check(double num){
        if (num % 5 == 0) System.out.printf("%f is divisible by 5.",num);
        else System.out.printf("%f is not divisible by 5.",num);
    }
}

public class Program13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Divisibility d = new Divisibility();

        System.out.print("Enter the number: ");
        double num = input.nextDouble();

        d.check(num);

        input.close();
    }
}
