// write a java program to grade students

package week1;
import java.util.*;

class GradingSystem{
    public void grades(int marks){
        if (90 <= marks && marks < 100) System.out.println("A");
        else if (80 <= marks && marks < 90) System.out.println("B");
        else if (70 <= marks && marks < 80) System.out.println("C");
        else if (60 <= marks && marks < 70) System.out.println("D");
        else if (50 <= marks && marks < 60) System.out.println("E");
        else if (00 <= marks && marks < 50) System.out.println("F");
        else System.out.println("Invalid marks");
    }
}

public class Program12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        GradingSystem gs = new GradingSystem();

        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        gs.grades(marks);

        input.close();
    }
}
