
package week2;
import java.util.Scanner;

// Class representing a Student
class Student {

    private int maths;
    private int physics;
    private int chemistry;

    // Constructor
    public Student(int maths, int physics, int chemistry) {
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    // Method to calculate total marks
    public int getTotal() {
        return maths + physics + chemistry;
    }

    // Method to check eligibility
    public boolean isEligible() {

        // Condition 1
        boolean condition1 =
                maths >= 60 &&
                        physics >= 50 &&
                        chemistry >= 40 &&
                        getTotal() >= 200;

        // Condition 2
        boolean condition2 =
                (maths + physics) >= 150;

        return condition1 || condition2;
    }
}

// Main class
public class Program5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Mathematics marks: ");
            int maths = sc.nextInt();

            System.out.print("Enter Physics marks: ");
            int physics = sc.nextInt();

            System.out.print("Enter Chemistry marks: ");
            int chemistry = sc.nextInt();

            // Creating Student object
            Student s = new Student(maths, physics, chemistry);

            // Checking eligibility
            if (s.isEligible()) {
                System.out.println("Result: ELIGIBLE");
            } else {
                System.out.println("Result: NOT ELIGIBLE");
            }
        }

        sc.close();
    }
}
