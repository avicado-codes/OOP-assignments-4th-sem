// write a java program to generate a multiplication table

package week2;
import java.util.*;

class MultiplicationTable{
    public void table(int num){
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + "= " + (num*i));
        }
    }
}

public class Program9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        MultiplicationTable m = new MultiplicationTable();

        System.out.print("Enter the multiplicand: ");
        int num = input.nextInt();

        m.table(num);

        input.close();
    }
}
