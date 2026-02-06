// write a java program to print all multiple of 10 in a certain user given range

package week2;
import java.util.*;

class Multiples{
    public void multipleOf10(int start, int end){
        int temp = start;
        while(temp % 10 != 0) temp++; // the loop can be replaced by int temp = ((start + 9) / 10) * 10;

        while(temp <= end){
            System.out.printf("%d ",temp);
            temp += 10;
        }
    }
}

public class Program8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Multiples m = new Multiples();

        System.out.print("Enter start and end: ");
        int start = input.nextInt();
        int end = input.nextInt();

        m.multipleOf10(start,end);

        input.close();
    }
}
