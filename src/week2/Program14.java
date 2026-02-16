// write a java program to check whether a number is palindrome or not

package week2;
import java.util.*;

class Palindrome{
    public boolean check(int num){
        // converting the integer to a string
        String str = Integer.toString(num);

        int low = 0, high = str.length() - 1;
        while(low < high){
            if (str.charAt(low) != str.charAt(high)) return false;

            low++;high--;
        }

        return true;
    }
}

public class Program14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Palindrome p = new Palindrome();

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (p.check(num)) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");

        input.close();
    }
}
