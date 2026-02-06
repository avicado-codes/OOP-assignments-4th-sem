// write a java program to count the number of digits in an integer

package week2;
import java.util.*;

class TotalDigits{
    public void count(int num){
        int count = 0;
        num = Math.abs(num);

        if (num == 0) {
            System.out.println("Total digits: 1");
            return;
        }

        while (num>0){
            num /= 10;
            count++;
        }
        System.out.println("Total digits: "+count);
    }
}

public class Program12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        TotalDigits dig = new TotalDigits();

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        dig.count(num);

        input.close();
    }
}
