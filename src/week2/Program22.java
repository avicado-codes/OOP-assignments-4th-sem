// write a java program to check if a number is an Armstrong number or not

package week2;
import java.util.*;

class ArmstrongNumber{
    void check(int num){
        int copy_num = num;
        int count = 0;

        // counting the digits of the number
        while (copy_num > 0){
            copy_num = copy_num / 10;
            count++;
        }

        copy_num = num;
        // Armstrong number logic
        int sum = 0;
        while (copy_num > 0){
            int rem = copy_num % 10;
            sum += Math.pow(rem,count);
            copy_num = copy_num/10;
        }
        if (sum == num) System.out.println("True");
        else System.out.println("False");
    }
}

public class Program22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArmstrongNumber a = new ArmstrongNumber();

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        a.check(num);
    }
}
