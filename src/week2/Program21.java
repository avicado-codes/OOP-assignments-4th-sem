// write a java program to display all the prime numbers in a range

package week2;
import java.util.*;

class DisplayPrimeNumbers{
    void display(int start, int end){
        PrimeNumber pn = new PrimeNumber();
        if (end < 2 && start < 2){
            System.out.println("No prime numbers in this range.");
            return;
        }
        for (int i = Math.max(2,start); i <= end; i++) {
            if (pn.check(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

public class Program21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter start and end: ");

        int start = input.nextInt();
        int end = input.nextInt();

        DisplayPrimeNumbers pn = new DisplayPrimeNumbers();

        pn.display(start,end);
    }
}
