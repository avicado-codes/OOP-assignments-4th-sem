// write a java program to find the median of a set of a numbers

package week2;
import java.util.*;

class Median{
    double CalculateMedian(int[] arr){

        // sorting the array
        Arrays.sort(arr);

        if (arr.length % 2 == 0){
            return (arr[arr.length / 2] + (arr[(arr.length / 2) - 1]))/2.0 ;
        }
        return arr[arr.length / 2];
    }

}

public class Program17 {
    public static void main(String[] args){
        if (args.length > 0){
            int[] arr = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }

            Median m = new Median();
            System.out.println("Median: "+ m.CalculateMedian(arr));
        }
    }
}
