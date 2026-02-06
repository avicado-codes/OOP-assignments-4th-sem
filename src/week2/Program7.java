// write a java program to calculate the sum of natural numbers upto a certain range

package week2;
import java.util.*;

class Sum{
    public int calculate(int num){
        if (num == 0){
            return 0;
        }
        return num+calculate(num-1);
    }
}

public class Program7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Sum sum = new Sum();

        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.println("Sum: "+ sum.calculate(n));

        input.close();
    }
}
