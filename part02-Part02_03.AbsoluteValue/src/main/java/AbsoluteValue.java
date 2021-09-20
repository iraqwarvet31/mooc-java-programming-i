
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get number from user
        int num = Integer.valueOf(scanner.nextLine());
        
        // if num is negative print its absolute, otherwsise print num
        if (num < 0) {
            System.out.println(Math.abs(num));
        } else {
            System.out.println(num);
        }
    }
}
