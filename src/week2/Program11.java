// write a java program to find the LCM of two numbers

package week2;
import java.util.*;

class Calculate{
    public int HCF(int a, int b){
        if (b == 0) return a;
        return HCF(b,a%b);
    }
    public int LCM(int a, int b){
        return (a/HCF(a,b))*b;
    }
}

public class Program11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Calculate lcm = new Calculate();

        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > 0 && b > 0){
            System.out.println("LCM: "+lcm.LCM(a,b));
        }
        else System.out.println("Please enter two positive numbers.");

        input.close();
    }
}
