// write a java program to find whether a year is a leap year or not

package week1;
import java.util.*;

class LeapYear{
    public void checkLeapYear(int year){
        if (year % 400 == 0) {
            System.out.print("Leap year");
        } else if (year % 100 == 0) {
            System.out.print("Not a leap year");
        } else if (year % 4 == 0) {
            System.out.print("Leap year");
        } else {
            System.out.print("Not a leap year");
        }
    }
}

public class Program11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        LeapYear ly = new LeapYear();

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        ly.checkLeapYear(year);

        input.close();
    }
}
