/*
--------------------------- PATTERN 1 ---------------------------
1
2 3 4
5 6 7 8 9

--------------------------- PATTERN 2 ---------------------------
      1
    2 1 2
  3 2 1 2 3
4 3 2 1 2 3 4

--------------------------- PATTERN 3 ---------------------------
1           1
  2       2
    3   3
      4
*/

package week2;
import java.util.Scanner;

class GeneratePatterns{
    void pattern1(int n){
        int k = 1;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < 2*i + 1; j++){
                System.out.print((k++) + " ");
            }
            System.out.println();
        }
    }

    void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = i+1; k > 0; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i+1; l++) {
                System.out.print(l);
            }
            System.out.println();
        }

    }

    void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i) System.out.print(j);
                else System.out.print(" ");
            }

            // for the spaces in between
            for (int m = 2*(n-i) - 1; m >= 1; m--) {
                System.out.print(" ");
            }

            for (int k = i; k >= 1; k--) {
                if (k == n) break;
                else if (k == i) System.out.print(k);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class Program23_24_25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = input.nextInt();

        GeneratePatterns pattern = new GeneratePatterns();

        pattern.pattern1(n);
        System.out.println();
        pattern.pattern2(n);
        System.out.println();
        pattern.pattern3(n);
    }
}
