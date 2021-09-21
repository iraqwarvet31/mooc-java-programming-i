
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get integer from user
        int num = Integer.valueOf(scanner.nextLine());
        
        // Print to a hundred starting from given num
        for (int i = num; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
