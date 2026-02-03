// write a java program to find out whether a number is odd or even

package week1;
import java.util.*;

class OddEven{
    public void check(int num){
        if (num % 2 == 0) System.out.print("Even");
        else System.out.print("Odd");
    }
}

public class Program6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        OddEven numCheck = new OddEven();

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        if (num >= 0) numCheck.check(num);
        else System.out.print("Error: Must be an integer.\n");

        input.close();
    }




}
