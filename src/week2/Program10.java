// write a java program to find the hcf of two numbers

package week2;
import java.util.*;

class HCF{
    public int find(int a, int b){
        if (b == 0) return a;
        return find(b,a%b);
    }
}

public class Program10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        HCF hcf = new HCF();

        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > 0 && b > 0){
            System.out.println("HCF: "+hcf.find(a,b));
        }
        else System.out.println("Please enter two positive numbers.");

        input.close();
    }
}
