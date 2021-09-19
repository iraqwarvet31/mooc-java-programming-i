
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first, second, third, sum;
        
        // Get first number
        System.out.println("Give the first number:");
        first = Integer.valueOf(scanner.nextLine());
        
        // Get second number
        System.out.println("Give the second number:");
        second = Integer.valueOf(scanner.nextLine());
        
        // Get third number
        System.out.println("Give the third number:");
        third = Integer.valueOf(scanner.nextLine());
        
        // Calculate average and print
        sum = first + second + third;
        System.out.println("The average is " + (double) sum / 3);

    }
}
