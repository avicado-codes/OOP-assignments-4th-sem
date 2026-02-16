// write a java program to generate all combination of 1 2 3 using loop

package week2;
import java.util.*;

class Permute{
     void compute(){
         int[] nums = {1,2,3};
         for (int i = 0; i < nums.length; i++) {
             for (int j = 0; j < nums.length; j++){
                 for (int k = 0; k < nums.length; k++){
                     if (i != j && j != k && k != i){
                         System.out.println(nums[i] + "" + nums[j] + "" + nums[k]);
                     }
                 }
             }

         }
     }
}

public class Program19 {
    public static void main(String[] args){
        Permute p = new Permute();
        p.compute();
    }
}
