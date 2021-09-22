
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first, second, sum = 0;
        
        // get first number from user
        System.out.println("First number?");
        first = Integer.valueOf(scanner.nextLine());
        
        // get second number from user
        System.out.println("Second number?");
        second = Integer.valueOf(scanner.nextLine());
        
        // Print sum between first and second inclusively and print
        for (int i = first; i <= second; i++) {
            sum += i;
        }
        
        System.out.println("The sum is: " + sum);
    }
}
