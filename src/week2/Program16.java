// write a java code to turn a binary number into a decimal number and a decimal number to binary number

package week2;
import java.util.*;

class Convert{
    void toBinary(String decimal){

        // turning the string into an integer
        int dec = Integer.parseInt(decimal);

        // binary number as a string
        String binary = Integer.toBinaryString(dec);

        System.out.println("In binary: "+binary);
    }
    void toDecimal(String binary){

        // turning the string into an integer
        int decimal = Integer.parseInt(binary, 2);

        System.out.println("In Decimal: "+decimal);
    }
}

public class Program16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");

        String num = input.nextLine();
        Convert check = new Convert();

        // checking if the string input is a binary number or a decimal number
        boolean isBinary = true;

        for (char c: num.toCharArray()){
            if(c != '0' && c != '1'){
                isBinary = false;
            }
            if (c < '0' || c > '9') {
                System.out.println("Please enter a BINARY NUMBER or a DECIMAL NUMBER.");
                return;
            }
        }

        if (isBinary) check.toDecimal(num);
        else check.toBinary(num);

    }
}
