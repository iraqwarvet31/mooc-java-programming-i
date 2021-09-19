
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get password from user
        System.out.println("Password?");
        String pwd = scan.nextLine();
        
        // Print message if correct password was used
        if (pwd.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
