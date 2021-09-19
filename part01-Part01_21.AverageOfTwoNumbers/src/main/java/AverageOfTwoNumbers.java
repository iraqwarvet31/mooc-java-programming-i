
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first, second, sum;
        // Get first number
        System.out.println("Give the first number:");
        first = Integer.valueOf(scanner.nextLine());
        
        // Get second number
        System.out.println("Give the second number:");
        second = Integer.valueOf(scanner.nextLine());
        
        // Calculate average and print
        sum = first + second;
        System.out.println("The average is " + (double) sum / 2);
    }
}
