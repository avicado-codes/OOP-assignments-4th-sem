// write a java program to check whether a number is buzz or not

package week2;
import java.util.*;

class BuzzNumbers{
    public boolean check(int num){
        return (num%7 == 0 || num%10 == 7);
    }
}

public class Program1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        BuzzNumbers bn = new BuzzNumbers();

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        boolean res = bn.check(num);

        if (res) System.out.println("Buzz Number");
        else System.out.println("Not a Buzz Number");

        input.close();
    }


}
