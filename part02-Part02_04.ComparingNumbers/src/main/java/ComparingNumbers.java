
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get first and second nums from user
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        
        // Find smallest number and print
        if (first > second) {
            System.out.println(first + " is greater than " + second + ".");
        } else if (first < second) {
            System.out.println(first + " is smaller than " + second + ".");
        } else {
            System.out.println(first + " is equal to " + second + ".");
        }
    }
}
