
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, product = 1;
                
        // Get number from user
        System.out.println("Give a number:");
        num = Integer.valueOf(scanner.nextLine());
        
        for (int i = 1; i <= num; i++) {
            product *= i;
        }
        
        System.out.println("Factorial: " + product);
    }
}
