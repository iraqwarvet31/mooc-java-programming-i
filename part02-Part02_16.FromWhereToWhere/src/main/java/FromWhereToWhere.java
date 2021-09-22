
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        
        // Get ending number from user
        System.out.println("Where to?");
        int end = Integer.valueOf(scanner.nextLine());
        
        // Get starting number from user
        System.out.println("Where from?");
        int start = Integer.valueOf(scanner.nextLine());
        
        // Print from start to end, only if start is less than end
        for (int i = start; i <= end; i++) {
            if (start <= end) {
                System.out.println(i);
            }
        }
    }
}
