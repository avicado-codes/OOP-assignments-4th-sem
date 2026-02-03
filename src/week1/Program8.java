// write a java program to find the maximum of 3 number

package week1;
import java.util.*;

class Maximum{
    public void findMax(double a, double b, double c){
        double max;
        if (a>b){
            if (a>c) max = a;
            else max = c;
        }
        else{
            if (b<c) max = c;
            else max = b;
        }
        System.out.println("Maximum: "+max);
    }
}

public class Program8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Maximum maximumVal = new Maximum();

        System.out.print("Enter 3 numbers separated by space: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        maximumVal.findMax(a,b,c);

        input.close();
    }
}
