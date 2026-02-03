// write a java program to print your name

package week1;
import java.util.*;

class Welcome{
    public void showWelcomeMessage(String name){
        System.out.println("Welcome "+name);
    }
}

public class Program1 {
    static public void main(String[] args){
        Scanner input = new Scanner(System.in);
        Welcome welcome = new Welcome();

        System.out.print("Enter your name: ");
        String username = input.nextLine();

        welcome.showWelcomeMessage(username);

        input.close();
    }
}
