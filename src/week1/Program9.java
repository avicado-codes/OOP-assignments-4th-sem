// write a java program to swap two numbers

package week1;
import java.util.*;

class Swap{
    public void swapNumbers(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
    }
}

public class Program9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Swap swap = new Swap();

        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();

        swap.swapNumbers(a,b);

        input.close();
    }
}
