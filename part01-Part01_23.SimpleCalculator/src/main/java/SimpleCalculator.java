
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first, second, sum, product, difference;
        double divisor;
        
        // Get first num
        System.out.println("Give the first number:");
        first = Integer.valueOf(scanner.nextLine());
        
        // Get second num
        System.out.println("Give the second number:");
        second = Integer.valueOf(scanner.nextLine());
        
        // Calculate sum, product, difference, and divisor
        sum = first + second;
        product = first * second;
        difference = first - second;
        divisor = (double) first / second;
        
        // Print calculations
        System.out.println(first + " + "  + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + difference);
        System.out.println(first + " * " + second + " = " + product);
        System.out.println(first + " / " + second + " = " + divisor);
        
    }
}
