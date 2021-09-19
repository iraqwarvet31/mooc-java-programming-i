
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get first num
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        // Get second num
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        // Print multiplication formula
        System.out.println(first + " * " + second + " = " + (first * second));

    }
}
