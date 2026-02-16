// write a java program to read two integer values m and n and to find whether m is a multiple of n

package week2;
import java.util.*;

class Multiple{
    void check(int m, int n){
        m = Math.abs(m);
        n = Math.abs(n);
        if (m % n == 0) System.out.println("True");
        else System.out.println("False");
    }
}

public class Program20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter m and n: ");
        int m = input.nextInt();
        int n = input.nextInt();
        Multiple multiple = new Multiple();
        multiple.check(m,n);
    }
}
