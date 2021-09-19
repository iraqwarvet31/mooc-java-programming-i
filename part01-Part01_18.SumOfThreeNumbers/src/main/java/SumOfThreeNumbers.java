
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get first number
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        // Get second number
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        // Get third number
        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());
        
        // Print message with sum of 3 numbers
        System.out.println("The sum of the numbers is " + (first + second + third));
    }
}
