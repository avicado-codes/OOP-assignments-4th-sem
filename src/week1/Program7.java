// write a java program to find whether a number is positive or negative

package week1;

import java.util.Scanner;

class Sign{
    public void check(double num){
        if (num < 0) System.out.println("Negative");
        else if (num == 0) System.out.println("Zero");
        else System.out.println("Positive");
    }
}

public class Program7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Sign signCheck = new Sign();

        System.out.print("Enter a number: ");
        double num = input.nextDouble();

        signCheck.check(num);

        input.close();
    }
}
