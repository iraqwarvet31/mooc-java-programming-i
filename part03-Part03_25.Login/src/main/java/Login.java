
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get username
        System.out.println("Enter username: ");
        String user = scanner.nextLine();
        
        // Get password
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        
        // Validate user/pass
        boolean validateAlex = user.equals("alex") && password.equals("sunshine");
        boolean validateEmma = user.equals("emma") && password.equals("haskell");
        if (validateAlex || validateEmma) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password");
        }
    }
}
