// write a java program to reverse a number

package week2;
import java.util.*;

class Reverse{
    public int printReverse(int num){
        int reversedNum = 0;
        while(num>0){
            int rem = num%10;
            reversedNum = reversedNum*10 + rem;
            num /= 10;
        }
        return reversedNum;
    }
}
public class Program4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Reverse rev = new Reverse();

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        System.out.print("Reversed Number: "+ rev.printReverse(num));

        input.close();
    }
}
