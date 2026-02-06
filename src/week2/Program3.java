// write a java program to print the Fibonacci series

package week2;
import java.util.*;

class FibonacciSeries{
    public void printFiboSeries(int terms){
        int a = 0, b = 1, c;
        for (int i = 0; i < terms; i++){
            System.out.printf("%d ",a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}

public class Program3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        FibonacciSeries fib = new FibonacciSeries();

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        fib.printFiboSeries(num);

        input.close();
    }
}
