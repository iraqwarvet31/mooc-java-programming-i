
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // write first string
        System.out.println("Enter first string:");
        String first = scan.nextLine();
        
        // write second string
        System.out.println("Enter second string:");
        String second = scan.nextLine();
        
        // comparison
        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
