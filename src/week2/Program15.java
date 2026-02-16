// write a java  program to check if a number is a prime number or not

package week2;
import java.util.*;

class PrimeNumber{
    boolean check(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) return false;
        }
        return true;
    }
}
public class Program15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        PrimeNumber pn = new PrimeNumber();

        System.out.print("Enter a number: ");

        int num = input.nextInt();

        System.out.println("Is a prime number: "+pn.check(num));
    }
}
