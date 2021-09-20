
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first, second, sum;
        
        // Get numbers from user then print square root
        first = Integer.valueOf(scanner.nextLine());
        second = Integer.valueOf(scanner.nextLine());
        sum = first + second;
        
        // Print square root of the sum
        System.out.println((int) (Math.sqrt(sum)));
    }
}
