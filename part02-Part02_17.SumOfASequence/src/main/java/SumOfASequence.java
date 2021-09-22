
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, num;
        
        // Get num from user
        System.out.println("Last number?");
        num = Integer.valueOf(scanner.nextLine());
        
        // Get sum of all values under num
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        
        System.out.println("The sum is " + sum);
    }
}
